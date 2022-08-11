package pl.trollsystems.inOK.service;

import org.modelmapper.ModelMapper;
import pl.trollsystems.inOK.dto.Mkg1DataDTO;
import pl.trollsystems.inOK.model.Mkg1Data;

import java.util.ArrayList;
import java.util.List;

public class Mkg1DataDTOMapper {
    private ModelMapper modelMapper;

    public List<Mkg1DataDTO> convertMkg1DataToDTO(List<Mkg1Data> mkg1DataList) {
        if(mkg1DataList == null){
            return  null;
        }

        List<Mkg1DataDTO> mkg1DataDTOList = new ArrayList<Mkg1DataDTO>(mkg1DataList.size());

        for (Mkg1Data mkg1Data : mkg1DataList) {
            mkg1DataDTOList.add(modelMapper.map(mkg1Data, Mkg1DataDTO.class));
        }
        return mkg1DataDTOList;
    }

    public List<Mkg1Data> convertMkg1DataDTOToMkg1Data(List<Mkg1DataDTO> mkg1DataDTOList) {
        if(mkg1DataDTOList == null){
            return  null;
        }

        List<Mkg1Data> mkg1DataList = new ArrayList<Mkg1Data>(mkg1DataDTOList.size());

        for (Mkg1DataDTO mkg1DataDTO : mkg1DataDTOList) {
            mkg1DataList.add(modelMapper.map(mkg1DataDTO, Mkg1Data.class));
        }
        return mkg1DataList;
    }

}
