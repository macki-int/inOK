package pl.trollsystems.inOK.model;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "mkg1_data_hex")
public class Mkg1Data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "lokalizacja")
    private String place;
    @Column(name = "serialized_data")
    private String serializedData;
    private LocalDateTime c;
    private Long ns;
    private Long np;
    private BigDecimal nap;
    private Long st1;
    private Long st2;
    private Long st3;
    private Long a1;
    @Column(precision = 10, scale = 2)
    private BigDecimal kx1;
    @Column(name = "kx1_hex")
    private String kx1Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ky1;
    @Column(name = "ky1_hex")
    private String ky1Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kxo1;
    @Column(name = "kxo1_hex")
    private String kxo1Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kyo1;
    @Column(name = "kyo1_hex")
    private String kyo1Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal tm1;
    @Column(name = "tm1_hex")
    private String tm1Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ox1;
    @Column(precision = 10, scale = 2)
    private BigDecimal oy1;
    private Long a2;
    @Column(precision = 10, scale = 2)
    private BigDecimal kx2;
    @Column(name = "kx2_hex")
    private String kx2Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ky2;
    @Column(name = "ky2_hex")
    private String ky2Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kxo2;
    @Column(name = "kxo2_hex")
    private String kxo2Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kyo2;
    @Column(name = "kyo2_hex")
    private String kyo2Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal tm2;
    @Column(name = "tm2_hex")
    private String tm2Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ox2;
    @Column(precision = 10, scale = 2)
    private BigDecimal oy2;
    private Long a3;
    @Column(precision = 10, scale = 2)
    private BigDecimal kx3;
    @Column(name = "kx3_hex")
    private String kx3Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ky3;
    @Column(name = "ky3_hex")
    private String ky3Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kxo3;
    @Column(name = "kxo3_hex")
    private String kxo3Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kyo3;
    @Column(name = "kyo3_hex")
    private String kyo3Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal tm3;
    @Column(name = "tm3_hex")
    private String tm3Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ox3;
    @Column(precision = 10, scale = 2)
    private BigDecimal oy3;
    private Long a4;
    @Column(precision = 10, scale = 2)
    private BigDecimal kx4;
    @Column(name = "kx4_hex")
    private String kx4Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ky4;
    @Column(name = "ky4_hex")
    private String ky4Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kxo4;
    @Column(name = "kxo4_hex")
    private String kxo4Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kyo4;
    @Column(name = "kyo4_hex")
    private String kyo4Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal tm4;
    @Column(name = "tm4_hex")
    private String tm4Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ox4;
    @Column(precision = 10, scale = 2)
    private BigDecimal oy4;
    private Long a5;
    @Column(precision = 10, scale = 2)
    private BigDecimal kx5;
    @Column(name = "kx5_hex")
    private String kx5Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ky5;
    @Column(name = "ky5_hex")
    private String ky5Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kxo5;
    @Column(name = "kxo5_hex")
    private String kxo5Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kyo5;
    @Column(name = "kyo5_hex")
    private String kyo5Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal tm5;
    @Column(name = "tm5_hex")
    private String tm5Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ox5;
    @Column(precision = 10, scale = 2)
    private BigDecimal oy5;
    private Long a6;
    @Column(precision = 10, scale = 2)
    private BigDecimal kx6;
    @Column(name = "kx6_hex")
    private String kx6Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ky6;
    @Column(name = "ky6_hex")
    private String ky6Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kxo6;
    @Column(name = "kxo6_hex")
    private String kxo6Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kyo6;
    @Column(name = "kyo6_hex")
    private String kyo6Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal tm6;
    @Column(name = "tm6_hex")
    private String tm6Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ox6;
    @Column(precision = 10, scale = 2)
    private BigDecimal oy6;
    private Long a7;
    @Column(precision = 10, scale = 2)
    private BigDecimal kx7;
    @Column(name = "kx7_hex")
    private String kx7Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ky7;
    @Column(name = "ky7_hex")
    private String ky7Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kxo7;
    @Column(name = "kxo7_hex")
    private String kxo7Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kyo7;
    @Column(name = "kyo7_hex")
    private String kyo7Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal tm7;
    @Column(name = "tm7_hex")
    private String tm7Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ox7;
    @Column(precision = 10, scale = 2)
    private BigDecimal oy7;
    private Long a8;
    @Column(precision = 10, scale = 2)
    private BigDecimal kx8;
    @Column(name = "kx8_hex")
    private String kx8Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ky8;
    @Column(name = "ky8_hex")
    private String ky8Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kxo8;
    @Column(name = "kxo8_hex")
    private String kxo8Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kyo8;
    @Column(name = "kyo8_hex")
    private String kyo8Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal tm8;
    @Column(name = "tm8_hex")
    private String tm8Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ox8;
    @Column(precision = 10, scale = 2)
    private BigDecimal oy8;
    private Long a9;
    @Column(precision = 10, scale = 2)
    private BigDecimal kx9;
    @Column(name = "kx9_hex")
    private String kx9Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ky9;
    @Column(name = "ky9_hex")
    private String ky9Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kxo9;
    @Column(name = "kxo9_hex")
    private String kxo9Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kyo9;
    @Column(name = "kyo9_hex")
    private String kyo9Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal tm9;
    @Column(name = "tm9_hex")
    private String tm9Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ox9;
    @Column(precision = 10, scale = 2)
    private BigDecimal oy9;
    private Long a10;
    @Column(precision = 10, scale = 2)
    private BigDecimal kx10;
    @Column(name = "kx10_hex")
    private String kx10Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ky10;
    @Column(name = "ky10_hex")
    private String ky10Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kxo10;
    @Column(name = "kxo10_hex")
    private String kxo10Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kyo10;
    @Column(name = "kyo10_hex")
    private String kyo10Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal tm10;
    @Column(name = "tm10_hex")
    private String tm10Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ox10;
    @Column(precision = 10, scale = 2)
    private BigDecimal oy10;
    private Long a11;
    @Column(precision = 10, scale = 2)
    private BigDecimal kx11;
    @Column(name = "kx11_hex")
    private String kx11Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ky11;
    @Column(name = "ky11_hex")
    private String ky11Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kxo11;
    @Column(name = "kxo11_hex")
    private String kxo11Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kyo11;
    @Column(name = "kyo11_hex")
    private String kyo11Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal tm11;
    @Column(name = "tm11_hex")
    private String tm11Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ox11;
    @Column(precision = 10, scale = 2)
    private BigDecimal oy11;
    private Long a12;
    @Column(precision = 10, scale = 2)
    private BigDecimal kx12;
    @Column(name = "kx12_hex")
    private String kx12Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ky12;
    @Column(name = "ky12_hex")
    private String ky12Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kxo12;
    @Column(name = "kxo12_hex")
    private String kxo12Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kyo12;
    @Column(name = "kyo12_hex")
    private String kyo12Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal tm12;
    @Column(name = "tm12_hex")
    private String tm12Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ox12;
    @Column(precision = 10, scale = 2)
    private BigDecimal oy12;
    private Long a13;
    @Column(precision = 10, scale = 2)
    private BigDecimal kx13;
    @Column(name = "kx13_hex")
    private String kx13Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ky13;
    @Column(name = "ky13_hex")
    private String ky13Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kxo13;
    @Column(name = "kxo13_hex")
    private String kxo13Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kyo13;
    @Column(name = "kyo13_hex")
    private String kyo13Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal tm13;
    @Column(name = "tm13_hex")
    private String tm13Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ox13;
    @Column(precision = 10, scale = 2)
    private BigDecimal oy13;
    private Long a14;
    @Column(precision = 10, scale = 2)
    private BigDecimal kx14;
    @Column(name = "kx14_hex")
    private String kx14Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ky14;
    @Column(name = "ky14_hex")
    private String ky14Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kxo14;
    @Column(name = "kxo14_hex")
    private String kxo14Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kyo14;
    @Column(name = "kyo14_hex")
    private String kyo14Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal tm14;
    @Column(name = "tm14_hex")
    private String tm14Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ox14;
    @Column(precision = 10, scale = 2)
    private BigDecimal oy14;
    private Long a15;
    @Column(precision = 10, scale = 2)
    private BigDecimal kx15;
    @Column(name = "kx15_hex")
    private String kx15Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ky15;
    @Column(name = "ky15_hex")
    private String ky15Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kxo15;
    @Column(name = "kxo15_hex")
    private String kxo15Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kyo15;
    @Column(name = "kyo15_hex")
    private String kyo15Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal tm15;
    @Column(name = "tm15_hex")
    private String tm15Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ox15;
    @Column(precision = 10, scale = 2)
    private BigDecimal oy15;
    private Long a16;
    @Column(precision = 10, scale = 2)
    private BigDecimal kx16;
    @Column(name = "kx16_hex")
    private String kx16Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ky16;
    @Column(name = "ky16_hex")
    private String ky16Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kxo16;
    @Column(name = "kxo16_hex")
    private String kxo16Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kyo16;
    @Column(name = "kyo16_hex")
    private String kyo16Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal tm16;
    @Column(name = "tm16_hex")
    private String tm16Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ox16;
    @Column(precision = 10, scale = 2)
    private BigDecimal oy16;
    private Long a17;
    @Column(precision = 10, scale = 2)
    private BigDecimal kx17;
    @Column(name = "kx17_hex")
    private String kx17Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ky17;
    @Column(name = "ky17_hex")
    private String ky17Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kxo17;
    @Column(name = "kxo17_hex")
    private String kxo17Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kyo17;
    @Column(name = "kyo17_hex")
    private String kyo17Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal tm17;
    @Column(name = "tm17_hex")
    private String tm17Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ox17;
    @Column(precision = 10, scale = 2)
    private BigDecimal oy17;
    private Long a18;
    @Column(precision = 10, scale = 2)
    private BigDecimal kx18;
    @Column(name = "kx18_hex")
    private String kx18Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ky18;
    @Column(name = "ky18_hex")
    private String ky18Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kxo18;
    @Column(name = "kxo18_hex")
    private String kxo18Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kyo18;
    @Column(name = "kyo18_hex")
    private String kyo18Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal tm18;
    @Column(name = "tm18_hex")
    private String tm18Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ox18;
    @Column(precision = 10, scale = 2)
    private BigDecimal oy18;
    private Long a19;
    @Column(precision = 10, scale = 2)
    private BigDecimal kx19;
    @Column(name = "kx19_hex")
    private String kx19Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ky19;
    @Column(name = "ky19_hex")
    private String ky19Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kxo19;
    @Column(name = "kxo19_hex")
    private String kxo19Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal kyo19;
    @Column(name = "kyo19_hex")
    private String kyo19Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal tm19;
    @Column(name = "tm19_hex")
    private String tm19Hex;
    @Column(precision = 10, scale = 2)
    private BigDecimal ox19;
    @Column(precision = 10, scale = 2)
    private BigDecimal oy19;
    @Column(precision = 16, scale = 8)
    private BigDecimal ci;
    @Column(precision = 16, scale = 8)
    private BigDecimal ti;
    @Column(name = "suma")
    private String sum;
    private String dod;
    @Column(name = "ins_ip")
    private String insIp;
    @Column(name = "ins_time")
    private LocalDateTime insTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getSerializedData() {
        return serializedData;
    }

    public void setSerializedData(String serializedData) {
        this.serializedData = serializedData;
    }

    public LocalDateTime getC() {
        return c;
    }

    public void setC(LocalDateTime c) {
        this.c = c;
    }

    public Long getNs() {
        return ns;
    }

    public void setNs(Long ns) {
        this.ns = ns;
    }

    public Long getNp() {
        return np;
    }

    public void setNp(Long np) {
        this.np = np;
    }

    public BigDecimal getNap() {
        return nap;
    }

    public void setNap(BigDecimal nap) {
        this.nap = nap;
    }

    public Long getSt1() {
        return st1;
    }

    public void setSt1(Long st1) {
        this.st1 = st1;
    }

    public Long getSt2() {
        return st2;
    }

    public void setSt2(Long st2) {
        this.st2 = st2;
    }

    public Long getSt3() {
        return st3;
    }

    public void setSt3(Long st3) {
        this.st3 = st3;
    }

    public Long getA1() {
        return a1;
    }

    public void setA1(Long a1) {
        this.a1 = a1;
    }

    public BigDecimal getKx1() {
        return kx1;
    }

    public void setKx1(BigDecimal kx1) {
        this.kx1 = kx1;
    }

    public String getKx1Hex() {
        return kx1Hex;
    }

    public void setKx1Hex(String kx1Hex) {
        this.kx1Hex = kx1Hex;
    }

    public BigDecimal getKy1() {
        return ky1;
    }

    public void setKy1(BigDecimal ky1) {
        this.ky1 = ky1;
    }

    public String getKy1Hex() {
        return ky1Hex;
    }

    public void setKy1Hex(String ky1Hex) {
        this.ky1Hex = ky1Hex;
    }

    public BigDecimal getKxo1() {
        return kxo1;
    }

    public void setKxo1(BigDecimal kxo1) {
        this.kxo1 = kxo1;
    }

    public String getKxo1Hex() {
        return kxo1Hex;
    }

    public void setKxo1Hex(String kxo1Hex) {
        this.kxo1Hex = kxo1Hex;
    }

    public BigDecimal getKyo1() {
        return kyo1;
    }

    public void setKyo1(BigDecimal kyo1) {
        this.kyo1 = kyo1;
    }

    public String getKyo1Hex() {
        return kyo1Hex;
    }

    public void setKyo1Hex(String kyo1Hex) {
        this.kyo1Hex = kyo1Hex;
    }

    public BigDecimal getTm1() {
        return tm1;
    }

    public void setTm1(BigDecimal tm1) {
        this.tm1 = tm1;
    }

    public String getTm1Hex() {
        return tm1Hex;
    }

    public void setTm1Hex(String tm1Hex) {
        this.tm1Hex = tm1Hex;
    }

    public BigDecimal getOx1() {
        return ox1;
    }

    public void setOx1(BigDecimal ox1) {
        this.ox1 = ox1;
    }

    public BigDecimal getOy1() {
        return oy1;
    }

    public void setOy1(BigDecimal oy1) {
        this.oy1 = oy1;
    }

    public Long getA2() {
        return a2;
    }

    public void setA2(Long a2) {
        this.a2 = a2;
    }

    public BigDecimal getKx2() {
        return kx2;
    }

    public void setKx2(BigDecimal kx2) {
        this.kx2 = kx2;
    }

    public String getKx2Hex() {
        return kx2Hex;
    }

    public void setKx2Hex(String kx2Hex) {
        this.kx2Hex = kx2Hex;
    }

    public BigDecimal getKy2() {
        return ky2;
    }

    public void setKy2(BigDecimal ky2) {
        this.ky2 = ky2;
    }

    public String getKy2Hex() {
        return ky2Hex;
    }

    public void setKy2Hex(String ky2Hex) {
        this.ky2Hex = ky2Hex;
    }

    public BigDecimal getKxo2() {
        return kxo2;
    }

    public void setKxo2(BigDecimal kxo2) {
        this.kxo2 = kxo2;
    }

    public String getKxo2Hex() {
        return kxo2Hex;
    }

    public void setKxo2Hex(String kxo2Hex) {
        this.kxo2Hex = kxo2Hex;
    }

    public BigDecimal getKyo2() {
        return kyo2;
    }

    public void setKyo2(BigDecimal kyo2) {
        this.kyo2 = kyo2;
    }

    public String getKyo2Hex() {
        return kyo2Hex;
    }

    public void setKyo2Hex(String kyo2Hex) {
        this.kyo2Hex = kyo2Hex;
    }

    public BigDecimal getTm2() {
        return tm2;
    }

    public void setTm2(BigDecimal tm2) {
        this.tm2 = tm2;
    }

    public String getTm2Hex() {
        return tm2Hex;
    }

    public void setTm2Hex(String tm2Hex) {
        this.tm2Hex = tm2Hex;
    }

    public BigDecimal getOx2() {
        return ox2;
    }

    public void setOx2(BigDecimal ox2) {
        this.ox2 = ox2;
    }

    public BigDecimal getOy2() {
        return oy2;
    }

    public void setOy2(BigDecimal oy2) {
        this.oy2 = oy2;
    }

    public Long getA3() {
        return a3;
    }

    public void setA3(Long a3) {
        this.a3 = a3;
    }

    public BigDecimal getKx3() {
        return kx3;
    }

    public void setKx3(BigDecimal kx3) {
        this.kx3 = kx3;
    }

    public String getKx3Hex() {
        return kx3Hex;
    }

    public void setKx3Hex(String kx3Hex) {
        this.kx3Hex = kx3Hex;
    }

    public BigDecimal getKy3() {
        return ky3;
    }

    public void setKy3(BigDecimal ky3) {
        this.ky3 = ky3;
    }

    public String getKy3Hex() {
        return ky3Hex;
    }

    public void setKy3Hex(String ky3Hex) {
        this.ky3Hex = ky3Hex;
    }

    public BigDecimal getKxo3() {
        return kxo3;
    }

    public void setKxo3(BigDecimal kxo3) {
        this.kxo3 = kxo3;
    }

    public String getKxo3Hex() {
        return kxo3Hex;
    }

    public void setKxo3Hex(String kxo3Hex) {
        this.kxo3Hex = kxo3Hex;
    }

    public BigDecimal getKyo3() {
        return kyo3;
    }

    public void setKyo3(BigDecimal kyo3) {
        this.kyo3 = kyo3;
    }

    public String getKyo3Hex() {
        return kyo3Hex;
    }

    public void setKyo3Hex(String kyo3Hex) {
        this.kyo3Hex = kyo3Hex;
    }

    public BigDecimal getTm3() {
        return tm3;
    }

    public void setTm3(BigDecimal tm3) {
        this.tm3 = tm3;
    }

    public String getTm3Hex() {
        return tm3Hex;
    }

    public void setTm3Hex(String tm3Hex) {
        this.tm3Hex = tm3Hex;
    }

    public BigDecimal getOx3() {
        return ox3;
    }

    public void setOx3(BigDecimal ox3) {
        this.ox3 = ox3;
    }

    public BigDecimal getOy3() {
        return oy3;
    }

    public void setOy3(BigDecimal oy3) {
        this.oy3 = oy3;
    }

    public Long getA4() {
        return a4;
    }

    public void setA4(Long a4) {
        this.a4 = a4;
    }

    public BigDecimal getKx4() {
        return kx4;
    }

    public void setKx4(BigDecimal kx4) {
        this.kx4 = kx4;
    }

    public String getKx4Hex() {
        return kx4Hex;
    }

    public void setKx4Hex(String kx4Hex) {
        this.kx4Hex = kx4Hex;
    }

    public BigDecimal getKy4() {
        return ky4;
    }

    public void setKy4(BigDecimal ky4) {
        this.ky4 = ky4;
    }

    public String getKy4Hex() {
        return ky4Hex;
    }

    public void setKy4Hex(String ky4Hex) {
        this.ky4Hex = ky4Hex;
    }

    public BigDecimal getKxo4() {
        return kxo4;
    }

    public void setKxo4(BigDecimal kxo4) {
        this.kxo4 = kxo4;
    }

    public String getKxo4Hex() {
        return kxo4Hex;
    }

    public void setKxo4Hex(String kxo4Hex) {
        this.kxo4Hex = kxo4Hex;
    }

    public BigDecimal getKyo4() {
        return kyo4;
    }

    public void setKyo4(BigDecimal kyo4) {
        this.kyo4 = kyo4;
    }

    public String getKyo4Hex() {
        return kyo4Hex;
    }

    public void setKyo4Hex(String kyo4Hex) {
        this.kyo4Hex = kyo4Hex;
    }

    public BigDecimal getTm4() {
        return tm4;
    }

    public void setTm4(BigDecimal tm4) {
        this.tm4 = tm4;
    }

    public String getTm4Hex() {
        return tm4Hex;
    }

    public void setTm4Hex(String tm4Hex) {
        this.tm4Hex = tm4Hex;
    }

    public BigDecimal getOx4() {
        return ox4;
    }

    public void setOx4(BigDecimal ox4) {
        this.ox4 = ox4;
    }

    public BigDecimal getOy4() {
        return oy4;
    }

    public void setOy4(BigDecimal oy4) {
        this.oy4 = oy4;
    }

    public Long getA5() {
        return a5;
    }

    public void setA5(Long a5) {
        this.a5 = a5;
    }

    public BigDecimal getKx5() {
        return kx5;
    }

    public void setKx5(BigDecimal kx5) {
        this.kx5 = kx5;
    }

    public String getKx5Hex() {
        return kx5Hex;
    }

    public void setKx5Hex(String kx5Hex) {
        this.kx5Hex = kx5Hex;
    }

    public BigDecimal getKy5() {
        return ky5;
    }

    public void setKy5(BigDecimal ky5) {
        this.ky5 = ky5;
    }

    public String getKy5Hex() {
        return ky5Hex;
    }

    public void setKy5Hex(String ky5Hex) {
        this.ky5Hex = ky5Hex;
    }

    public BigDecimal getKxo5() {
        return kxo5;
    }

    public void setKxo5(BigDecimal kxo5) {
        this.kxo5 = kxo5;
    }

    public String getKxo5Hex() {
        return kxo5Hex;
    }

    public void setKxo5Hex(String kxo5Hex) {
        this.kxo5Hex = kxo5Hex;
    }

    public BigDecimal getKyo5() {
        return kyo5;
    }

    public void setKyo5(BigDecimal kyo5) {
        this.kyo5 = kyo5;
    }

    public String getKyo5Hex() {
        return kyo5Hex;
    }

    public void setKyo5Hex(String kyo5Hex) {
        this.kyo5Hex = kyo5Hex;
    }

    public BigDecimal getTm5() {
        return tm5;
    }

    public void setTm5(BigDecimal tm5) {
        this.tm5 = tm5;
    }

    public String getTm5Hex() {
        return tm5Hex;
    }

    public void setTm5Hex(String tm5Hex) {
        this.tm5Hex = tm5Hex;
    }

    public BigDecimal getOx5() {
        return ox5;
    }

    public void setOx5(BigDecimal ox5) {
        this.ox5 = ox5;
    }

    public BigDecimal getOy5() {
        return oy5;
    }

    public void setOy5(BigDecimal oy5) {
        this.oy5 = oy5;
    }

    public Long getA6() {
        return a6;
    }

    public void setA6(Long a6) {
        this.a6 = a6;
    }

    public BigDecimal getKx6() {
        return kx6;
    }

    public void setKx6(BigDecimal kx6) {
        this.kx6 = kx6;
    }

    public String getKx6Hex() {
        return kx6Hex;
    }

    public void setKx6Hex(String kx6Hex) {
        this.kx6Hex = kx6Hex;
    }

    public BigDecimal getKy6() {
        return ky6;
    }

    public void setKy6(BigDecimal ky6) {
        this.ky6 = ky6;
    }

    public String getKy6Hex() {
        return ky6Hex;
    }

    public void setKy6Hex(String ky6Hex) {
        this.ky6Hex = ky6Hex;
    }

    public BigDecimal getKxo6() {
        return kxo6;
    }

    public void setKxo6(BigDecimal kxo6) {
        this.kxo6 = kxo6;
    }

    public String getKxo6Hex() {
        return kxo6Hex;
    }

    public void setKxo6Hex(String kxo6Hex) {
        this.kxo6Hex = kxo6Hex;
    }

    public BigDecimal getKyo6() {
        return kyo6;
    }

    public void setKyo6(BigDecimal kyo6) {
        this.kyo6 = kyo6;
    }

    public String getKyo6Hex() {
        return kyo6Hex;
    }

    public void setKyo6Hex(String kyo6Hex) {
        this.kyo6Hex = kyo6Hex;
    }

    public BigDecimal getTm6() {
        return tm6;
    }

    public void setTm6(BigDecimal tm6) {
        this.tm6 = tm6;
    }

    public String getTm6Hex() {
        return tm6Hex;
    }

    public void setTm6Hex(String tm6Hex) {
        this.tm6Hex = tm6Hex;
    }

    public BigDecimal getOx6() {
        return ox6;
    }

    public void setOx6(BigDecimal ox6) {
        this.ox6 = ox6;
    }

    public BigDecimal getOy6() {
        return oy6;
    }

    public void setOy6(BigDecimal oy6) {
        this.oy6 = oy6;
    }

    public Long getA7() {
        return a7;
    }

    public void setA7(Long a7) {
        this.a7 = a7;
    }

    public BigDecimal getKx7() {
        return kx7;
    }

    public void setKx7(BigDecimal kx7) {
        this.kx7 = kx7;
    }

    public String getKx7Hex() {
        return kx7Hex;
    }

    public void setKx7Hex(String kx7Hex) {
        this.kx7Hex = kx7Hex;
    }

    public BigDecimal getKy7() {
        return ky7;
    }

    public void setKy7(BigDecimal ky7) {
        this.ky7 = ky7;
    }

    public String getKy7Hex() {
        return ky7Hex;
    }

    public void setKy7Hex(String ky7Hex) {
        this.ky7Hex = ky7Hex;
    }

    public BigDecimal getKxo7() {
        return kxo7;
    }

    public void setKxo7(BigDecimal kxo7) {
        this.kxo7 = kxo7;
    }

    public String getKxo7Hex() {
        return kxo7Hex;
    }

    public void setKxo7Hex(String kxo7Hex) {
        this.kxo7Hex = kxo7Hex;
    }

    public BigDecimal getKyo7() {
        return kyo7;
    }

    public void setKyo7(BigDecimal kyo7) {
        this.kyo7 = kyo7;
    }

    public String getKyo7Hex() {
        return kyo7Hex;
    }

    public void setKyo7Hex(String kyo7Hex) {
        this.kyo7Hex = kyo7Hex;
    }

    public BigDecimal getTm7() {
        return tm7;
    }

    public void setTm7(BigDecimal tm7) {
        this.tm7 = tm7;
    }

    public String getTm7Hex() {
        return tm7Hex;
    }

    public void setTm7Hex(String tm7Hex) {
        this.tm7Hex = tm7Hex;
    }

    public BigDecimal getOx7() {
        return ox7;
    }

    public void setOx7(BigDecimal ox7) {
        this.ox7 = ox7;
    }

    public BigDecimal getOy7() {
        return oy7;
    }

    public void setOy7(BigDecimal oy7) {
        this.oy7 = oy7;
    }

    public Long getA8() {
        return a8;
    }

    public void setA8(Long a8) {
        this.a8 = a8;
    }

    public BigDecimal getKx8() {
        return kx8;
    }

    public void setKx8(BigDecimal kx8) {
        this.kx8 = kx8;
    }

    public String getKx8Hex() {
        return kx8Hex;
    }

    public void setKx8Hex(String kx8Hex) {
        this.kx8Hex = kx8Hex;
    }

    public BigDecimal getKy8() {
        return ky8;
    }

    public void setKy8(BigDecimal ky8) {
        this.ky8 = ky8;
    }

    public String getKy8Hex() {
        return ky8Hex;
    }

    public void setKy8Hex(String ky8Hex) {
        this.ky8Hex = ky8Hex;
    }

    public BigDecimal getKxo8() {
        return kxo8;
    }

    public void setKxo8(BigDecimal kxo8) {
        this.kxo8 = kxo8;
    }

    public String getKxo8Hex() {
        return kxo8Hex;
    }

    public void setKxo8Hex(String kxo8Hex) {
        this.kxo8Hex = kxo8Hex;
    }

    public BigDecimal getKyo8() {
        return kyo8;
    }

    public void setKyo8(BigDecimal kyo8) {
        this.kyo8 = kyo8;
    }

    public String getKyo8Hex() {
        return kyo8Hex;
    }

    public void setKyo8Hex(String kyo8Hex) {
        this.kyo8Hex = kyo8Hex;
    }

    public BigDecimal getTm8() {
        return tm8;
    }

    public void setTm8(BigDecimal tm8) {
        this.tm8 = tm8;
    }

    public String getTm8Hex() {
        return tm8Hex;
    }

    public void setTm8Hex(String tm8Hex) {
        this.tm8Hex = tm8Hex;
    }

    public BigDecimal getOx8() {
        return ox8;
    }

    public void setOx8(BigDecimal ox8) {
        this.ox8 = ox8;
    }

    public BigDecimal getOy8() {
        return oy8;
    }

    public void setOy8(BigDecimal oy8) {
        this.oy8 = oy8;
    }

    public Long getA9() {
        return a9;
    }

    public void setA9(Long a9) {
        this.a9 = a9;
    }

    public BigDecimal getKx9() {
        return kx9;
    }

    public void setKx9(BigDecimal kx9) {
        this.kx9 = kx9;
    }

    public String getKx9Hex() {
        return kx9Hex;
    }

    public void setKx9Hex(String kx9Hex) {
        this.kx9Hex = kx9Hex;
    }

    public BigDecimal getKy9() {
        return ky9;
    }

    public void setKy9(BigDecimal ky9) {
        this.ky9 = ky9;
    }

    public String getKy9Hex() {
        return ky9Hex;
    }

    public void setKy9Hex(String ky9Hex) {
        this.ky9Hex = ky9Hex;
    }

    public BigDecimal getKxo9() {
        return kxo9;
    }

    public void setKxo9(BigDecimal kxo9) {
        this.kxo9 = kxo9;
    }

    public String getKxo9Hex() {
        return kxo9Hex;
    }

    public void setKxo9Hex(String kxo9Hex) {
        this.kxo9Hex = kxo9Hex;
    }

    public BigDecimal getKyo9() {
        return kyo9;
    }

    public void setKyo9(BigDecimal kyo9) {
        this.kyo9 = kyo9;
    }

    public String getKyo9Hex() {
        return kyo9Hex;
    }

    public void setKyo9Hex(String kyo9Hex) {
        this.kyo9Hex = kyo9Hex;
    }

    public BigDecimal getTm9() {
        return tm9;
    }

    public void setTm9(BigDecimal tm9) {
        this.tm9 = tm9;
    }

    public String getTm9Hex() {
        return tm9Hex;
    }

    public void setTm9Hex(String tm9Hex) {
        this.tm9Hex = tm9Hex;
    }

    public BigDecimal getOx9() {
        return ox9;
    }

    public void setOx9(BigDecimal ox9) {
        this.ox9 = ox9;
    }

    public BigDecimal getOy9() {
        return oy9;
    }

    public void setOy9(BigDecimal oy9) {
        this.oy9 = oy9;
    }

    public Long getA10() {
        return a10;
    }

    public void setA10(Long a10) {
        this.a10 = a10;
    }

    public BigDecimal getKx10() {
        return kx10;
    }

    public void setKx10(BigDecimal kx10) {
        this.kx10 = kx10;
    }

    public String getKx10Hex() {
        return kx10Hex;
    }

    public void setKx10Hex(String kx10Hex) {
        this.kx10Hex = kx10Hex;
    }

    public BigDecimal getKy10() {
        return ky10;
    }

    public void setKy10(BigDecimal ky10) {
        this.ky10 = ky10;
    }

    public String getKy10Hex() {
        return ky10Hex;
    }

    public void setKy10Hex(String ky10Hex) {
        this.ky10Hex = ky10Hex;
    }

    public BigDecimal getKxo10() {
        return kxo10;
    }

    public void setKxo10(BigDecimal kxo10) {
        this.kxo10 = kxo10;
    }

    public String getKxo10Hex() {
        return kxo10Hex;
    }

    public void setKxo10Hex(String kxo10Hex) {
        this.kxo10Hex = kxo10Hex;
    }

    public BigDecimal getKyo10() {
        return kyo10;
    }

    public void setKyo10(BigDecimal kyo10) {
        this.kyo10 = kyo10;
    }

    public String getKyo10Hex() {
        return kyo10Hex;
    }

    public void setKyo10Hex(String kyo10Hex) {
        this.kyo10Hex = kyo10Hex;
    }

    public BigDecimal getTm10() {
        return tm10;
    }

    public void setTm10(BigDecimal tm10) {
        this.tm10 = tm10;
    }

    public String getTm10Hex() {
        return tm10Hex;
    }

    public void setTm10Hex(String tm10Hex) {
        this.tm10Hex = tm10Hex;
    }

    public BigDecimal getOx10() {
        return ox10;
    }

    public void setOx10(BigDecimal ox10) {
        this.ox10 = ox10;
    }

    public BigDecimal getOy10() {
        return oy10;
    }

    public void setOy10(BigDecimal oy10) {
        this.oy10 = oy10;
    }

    public Long getA11() {
        return a11;
    }

    public void setA11(Long a11) {
        this.a11 = a11;
    }

    public BigDecimal getKx11() {
        return kx11;
    }

    public void setKx11(BigDecimal kx11) {
        this.kx11 = kx11;
    }

    public String getKx11Hex() {
        return kx11Hex;
    }

    public void setKx11Hex(String kx11Hex) {
        this.kx11Hex = kx11Hex;
    }

    public BigDecimal getKy11() {
        return ky11;
    }

    public void setKy11(BigDecimal ky11) {
        this.ky11 = ky11;
    }

    public String getKy11Hex() {
        return ky11Hex;
    }

    public void setKy11Hex(String ky11Hex) {
        this.ky11Hex = ky11Hex;
    }

    public BigDecimal getKxo11() {
        return kxo11;
    }

    public void setKxo11(BigDecimal kxo11) {
        this.kxo11 = kxo11;
    }

    public String getKxo11Hex() {
        return kxo11Hex;
    }

    public void setKxo11Hex(String kxo11Hex) {
        this.kxo11Hex = kxo11Hex;
    }

    public BigDecimal getKyo11() {
        return kyo11;
    }

    public void setKyo11(BigDecimal kyo11) {
        this.kyo11 = kyo11;
    }

    public String getKyo11Hex() {
        return kyo11Hex;
    }

    public void setKyo11Hex(String kyo11Hex) {
        this.kyo11Hex = kyo11Hex;
    }

    public BigDecimal getTm11() {
        return tm11;
    }

    public void setTm11(BigDecimal tm11) {
        this.tm11 = tm11;
    }

    public String getTm11Hex() {
        return tm11Hex;
    }

    public void setTm11Hex(String tm11Hex) {
        this.tm11Hex = tm11Hex;
    }

    public BigDecimal getOx11() {
        return ox11;
    }

    public void setOx11(BigDecimal ox11) {
        this.ox11 = ox11;
    }

    public BigDecimal getOy11() {
        return oy11;
    }

    public void setOy11(BigDecimal oy11) {
        this.oy11 = oy11;
    }

    public Long getA12() {
        return a12;
    }

    public void setA12(Long a12) {
        this.a12 = a12;
    }

    public BigDecimal getKx12() {
        return kx12;
    }

    public void setKx12(BigDecimal kx12) {
        this.kx12 = kx12;
    }

    public String getKx12Hex() {
        return kx12Hex;
    }

    public void setKx12Hex(String kx12Hex) {
        this.kx12Hex = kx12Hex;
    }

    public BigDecimal getKy12() {
        return ky12;
    }

    public void setKy12(BigDecimal ky12) {
        this.ky12 = ky12;
    }

    public String getKy12Hex() {
        return ky12Hex;
    }

    public void setKy12Hex(String ky12Hex) {
        this.ky12Hex = ky12Hex;
    }

    public BigDecimal getKxo12() {
        return kxo12;
    }

    public void setKxo12(BigDecimal kxo12) {
        this.kxo12 = kxo12;
    }

    public String getKxo12Hex() {
        return kxo12Hex;
    }

    public void setKxo12Hex(String kxo12Hex) {
        this.kxo12Hex = kxo12Hex;
    }

    public BigDecimal getKyo12() {
        return kyo12;
    }

    public void setKyo12(BigDecimal kyo12) {
        this.kyo12 = kyo12;
    }

    public String getKyo12Hex() {
        return kyo12Hex;
    }

    public void setKyo12Hex(String kyo12Hex) {
        this.kyo12Hex = kyo12Hex;
    }

    public BigDecimal getTm12() {
        return tm12;
    }

    public void setTm12(BigDecimal tm12) {
        this.tm12 = tm12;
    }

    public String getTm12Hex() {
        return tm12Hex;
    }

    public void setTm12Hex(String tm12Hex) {
        this.tm12Hex = tm12Hex;
    }

    public BigDecimal getOx12() {
        return ox12;
    }

    public void setOx12(BigDecimal ox12) {
        this.ox12 = ox12;
    }

    public BigDecimal getOy12() {
        return oy12;
    }

    public void setOy12(BigDecimal oy12) {
        this.oy12 = oy12;
    }

    public Long getA13() {
        return a13;
    }

    public void setA13(Long a13) {
        this.a13 = a13;
    }

    public BigDecimal getKx13() {
        return kx13;
    }

    public void setKx13(BigDecimal kx13) {
        this.kx13 = kx13;
    }

    public String getKx13Hex() {
        return kx13Hex;
    }

    public void setKx13Hex(String kx13Hex) {
        this.kx13Hex = kx13Hex;
    }

    public BigDecimal getKy13() {
        return ky13;
    }

    public void setKy13(BigDecimal ky13) {
        this.ky13 = ky13;
    }

    public String getKy13Hex() {
        return ky13Hex;
    }

    public void setKy13Hex(String ky13Hex) {
        this.ky13Hex = ky13Hex;
    }

    public BigDecimal getKxo13() {
        return kxo13;
    }

    public void setKxo13(BigDecimal kxo13) {
        this.kxo13 = kxo13;
    }

    public String getKxo13Hex() {
        return kxo13Hex;
    }

    public void setKxo13Hex(String kxo13Hex) {
        this.kxo13Hex = kxo13Hex;
    }

    public BigDecimal getKyo13() {
        return kyo13;
    }

    public void setKyo13(BigDecimal kyo13) {
        this.kyo13 = kyo13;
    }

    public String getKyo13Hex() {
        return kyo13Hex;
    }

    public void setKyo13Hex(String kyo13Hex) {
        this.kyo13Hex = kyo13Hex;
    }

    public BigDecimal getTm13() {
        return tm13;
    }

    public void setTm13(BigDecimal tm13) {
        this.tm13 = tm13;
    }

    public String getTm13Hex() {
        return tm13Hex;
    }

    public void setTm13Hex(String tm13Hex) {
        this.tm13Hex = tm13Hex;
    }

    public BigDecimal getOx13() {
        return ox13;
    }

    public void setOx13(BigDecimal ox13) {
        this.ox13 = ox13;
    }

    public BigDecimal getOy13() {
        return oy13;
    }

    public void setOy13(BigDecimal oy13) {
        this.oy13 = oy13;
    }

    public Long getA14() {
        return a14;
    }

    public void setA14(Long a14) {
        this.a14 = a14;
    }

    public BigDecimal getKx14() {
        return kx14;
    }

    public void setKx14(BigDecimal kx14) {
        this.kx14 = kx14;
    }

    public String getKx14Hex() {
        return kx14Hex;
    }

    public void setKx14Hex(String kx14Hex) {
        this.kx14Hex = kx14Hex;
    }

    public BigDecimal getKy14() {
        return ky14;
    }

    public void setKy14(BigDecimal ky14) {
        this.ky14 = ky14;
    }

    public String getKy14Hex() {
        return ky14Hex;
    }

    public void setKy14Hex(String ky14Hex) {
        this.ky14Hex = ky14Hex;
    }

    public BigDecimal getKxo14() {
        return kxo14;
    }

    public void setKxo14(BigDecimal kxo14) {
        this.kxo14 = kxo14;
    }

    public String getKxo14Hex() {
        return kxo14Hex;
    }

    public void setKxo14Hex(String kxo14Hex) {
        this.kxo14Hex = kxo14Hex;
    }

    public BigDecimal getKyo14() {
        return kyo14;
    }

    public void setKyo14(BigDecimal kyo14) {
        this.kyo14 = kyo14;
    }

    public String getKyo14Hex() {
        return kyo14Hex;
    }

    public void setKyo14Hex(String kyo14Hex) {
        this.kyo14Hex = kyo14Hex;
    }

    public BigDecimal getTm14() {
        return tm14;
    }

    public void setTm14(BigDecimal tm14) {
        this.tm14 = tm14;
    }

    public String getTm14Hex() {
        return tm14Hex;
    }

    public void setTm14Hex(String tm14Hex) {
        this.tm14Hex = tm14Hex;
    }

    public BigDecimal getOx14() {
        return ox14;
    }

    public void setOx14(BigDecimal ox14) {
        this.ox14 = ox14;
    }

    public BigDecimal getOy14() {
        return oy14;
    }

    public void setOy14(BigDecimal oy14) {
        this.oy14 = oy14;
    }

    public Long getA15() {
        return a15;
    }

    public void setA15(Long a15) {
        this.a15 = a15;
    }

    public BigDecimal getKx15() {
        return kx15;
    }

    public void setKx15(BigDecimal kx15) {
        this.kx15 = kx15;
    }

    public String getKx15Hex() {
        return kx15Hex;
    }

    public void setKx15Hex(String kx15Hex) {
        this.kx15Hex = kx15Hex;
    }

    public BigDecimal getKy15() {
        return ky15;
    }

    public void setKy15(BigDecimal ky15) {
        this.ky15 = ky15;
    }

    public String getKy15Hex() {
        return ky15Hex;
    }

    public void setKy15Hex(String ky15Hex) {
        this.ky15Hex = ky15Hex;
    }

    public BigDecimal getKxo15() {
        return kxo15;
    }

    public void setKxo15(BigDecimal kxo15) {
        this.kxo15 = kxo15;
    }

    public String getKxo15Hex() {
        return kxo15Hex;
    }

    public void setKxo15Hex(String kxo15Hex) {
        this.kxo15Hex = kxo15Hex;
    }

    public BigDecimal getKyo15() {
        return kyo15;
    }

    public void setKyo15(BigDecimal kyo15) {
        this.kyo15 = kyo15;
    }

    public String getKyo15Hex() {
        return kyo15Hex;
    }

    public void setKyo15Hex(String kyo15Hex) {
        this.kyo15Hex = kyo15Hex;
    }

    public BigDecimal getTm15() {
        return tm15;
    }

    public void setTm15(BigDecimal tm15) {
        this.tm15 = tm15;
    }

    public String getTm15Hex() {
        return tm15Hex;
    }

    public void setTm15Hex(String tm15Hex) {
        this.tm15Hex = tm15Hex;
    }

    public BigDecimal getOx15() {
        return ox15;
    }

    public void setOx15(BigDecimal ox15) {
        this.ox15 = ox15;
    }

    public BigDecimal getOy15() {
        return oy15;
    }

    public void setOy15(BigDecimal oy15) {
        this.oy15 = oy15;
    }

    public Long getA16() {
        return a16;
    }

    public void setA16(Long a16) {
        this.a16 = a16;
    }

    public BigDecimal getKx16() {
        return kx16;
    }

    public void setKx16(BigDecimal kx16) {
        this.kx16 = kx16;
    }

    public String getKx16Hex() {
        return kx16Hex;
    }

    public void setKx16Hex(String kx16Hex) {
        this.kx16Hex = kx16Hex;
    }

    public BigDecimal getKy16() {
        return ky16;
    }

    public void setKy16(BigDecimal ky16) {
        this.ky16 = ky16;
    }

    public String getKy16Hex() {
        return ky16Hex;
    }

    public void setKy16Hex(String ky16Hex) {
        this.ky16Hex = ky16Hex;
    }

    public BigDecimal getKxo16() {
        return kxo16;
    }

    public void setKxo16(BigDecimal kxo16) {
        this.kxo16 = kxo16;
    }

    public String getKxo16Hex() {
        return kxo16Hex;
    }

    public void setKxo16Hex(String kxo16Hex) {
        this.kxo16Hex = kxo16Hex;
    }

    public BigDecimal getKyo16() {
        return kyo16;
    }

    public void setKyo16(BigDecimal kyo16) {
        this.kyo16 = kyo16;
    }

    public String getKyo16Hex() {
        return kyo16Hex;
    }

    public void setKyo16Hex(String kyo16Hex) {
        this.kyo16Hex = kyo16Hex;
    }

    public BigDecimal getTm16() {
        return tm16;
    }

    public void setTm16(BigDecimal tm16) {
        this.tm16 = tm16;
    }

    public String getTm16Hex() {
        return tm16Hex;
    }

    public void setTm16Hex(String tm16Hex) {
        this.tm16Hex = tm16Hex;
    }

    public BigDecimal getOx16() {
        return ox16;
    }

    public void setOx16(BigDecimal ox16) {
        this.ox16 = ox16;
    }

    public BigDecimal getOy16() {
        return oy16;
    }

    public void setOy16(BigDecimal oy16) {
        this.oy16 = oy16;
    }

    public Long getA17() {
        return a17;
    }

    public void setA17(Long a17) {
        this.a17 = a17;
    }

    public BigDecimal getKx17() {
        return kx17;
    }

    public void setKx17(BigDecimal kx17) {
        this.kx17 = kx17;
    }

    public String getKx17Hex() {
        return kx17Hex;
    }

    public void setKx17Hex(String kx17Hex) {
        this.kx17Hex = kx17Hex;
    }

    public BigDecimal getKy17() {
        return ky17;
    }

    public void setKy17(BigDecimal ky17) {
        this.ky17 = ky17;
    }

    public String getKy17Hex() {
        return ky17Hex;
    }

    public void setKy17Hex(String ky17Hex) {
        this.ky17Hex = ky17Hex;
    }

    public BigDecimal getKxo17() {
        return kxo17;
    }

    public void setKxo17(BigDecimal kxo17) {
        this.kxo17 = kxo17;
    }

    public String getKxo17Hex() {
        return kxo17Hex;
    }

    public void setKxo17Hex(String kxo17Hex) {
        this.kxo17Hex = kxo17Hex;
    }

    public BigDecimal getKyo17() {
        return kyo17;
    }

    public void setKyo17(BigDecimal kyo17) {
        this.kyo17 = kyo17;
    }

    public String getKyo17Hex() {
        return kyo17Hex;
    }

    public void setKyo17Hex(String kyo17Hex) {
        this.kyo17Hex = kyo17Hex;
    }

    public BigDecimal getTm17() {
        return tm17;
    }

    public void setTm17(BigDecimal tm17) {
        this.tm17 = tm17;
    }

    public String getTm17Hex() {
        return tm17Hex;
    }

    public void setTm17Hex(String tm17Hex) {
        this.tm17Hex = tm17Hex;
    }

    public BigDecimal getOx17() {
        return ox17;
    }

    public void setOx17(BigDecimal ox17) {
        this.ox17 = ox17;
    }

    public BigDecimal getOy17() {
        return oy17;
    }

    public void setOy17(BigDecimal oy17) {
        this.oy17 = oy17;
    }

    public Long getA18() {
        return a18;
    }

    public void setA18(Long a18) {
        this.a18 = a18;
    }

    public BigDecimal getKx18() {
        return kx18;
    }

    public void setKx18(BigDecimal kx18) {
        this.kx18 = kx18;
    }

    public String getKx18Hex() {
        return kx18Hex;
    }

    public void setKx18Hex(String kx18Hex) {
        this.kx18Hex = kx18Hex;
    }

    public BigDecimal getKy18() {
        return ky18;
    }

    public void setKy18(BigDecimal ky18) {
        this.ky18 = ky18;
    }

    public String getKy18Hex() {
        return ky18Hex;
    }

    public void setKy18Hex(String ky18Hex) {
        this.ky18Hex = ky18Hex;
    }

    public BigDecimal getKxo18() {
        return kxo18;
    }

    public void setKxo18(BigDecimal kxo18) {
        this.kxo18 = kxo18;
    }

    public String getKxo18Hex() {
        return kxo18Hex;
    }

    public void setKxo18Hex(String kxo18Hex) {
        this.kxo18Hex = kxo18Hex;
    }

    public BigDecimal getKyo18() {
        return kyo18;
    }

    public void setKyo18(BigDecimal kyo18) {
        this.kyo18 = kyo18;
    }

    public String getKyo18Hex() {
        return kyo18Hex;
    }

    public void setKyo18Hex(String kyo18Hex) {
        this.kyo18Hex = kyo18Hex;
    }

    public BigDecimal getTm18() {
        return tm18;
    }

    public void setTm18(BigDecimal tm18) {
        this.tm18 = tm18;
    }

    public String getTm18Hex() {
        return tm18Hex;
    }

    public void setTm18Hex(String tm18Hex) {
        this.tm18Hex = tm18Hex;
    }

    public BigDecimal getOx18() {
        return ox18;
    }

    public void setOx18(BigDecimal ox18) {
        this.ox18 = ox18;
    }

    public BigDecimal getOy18() {
        return oy18;
    }

    public void setOy18(BigDecimal oy18) {
        this.oy18 = oy18;
    }

    public Long getA19() {
        return a19;
    }

    public void setA19(Long a19) {
        this.a19 = a19;
    }

    public BigDecimal getKx19() {
        return kx19;
    }

    public void setKx19(BigDecimal kx19) {
        this.kx19 = kx19;
    }

    public String getKx19Hex() {
        return kx19Hex;
    }

    public void setKx19Hex(String kx19Hex) {
        this.kx19Hex = kx19Hex;
    }

    public BigDecimal getKy19() {
        return ky19;
    }

    public void setKy19(BigDecimal ky19) {
        this.ky19 = ky19;
    }

    public String getKy19Hex() {
        return ky19Hex;
    }

    public void setKy19Hex(String ky19Hex) {
        this.ky19Hex = ky19Hex;
    }

    public BigDecimal getKxo19() {
        return kxo19;
    }

    public void setKxo19(BigDecimal kxo19) {
        this.kxo19 = kxo19;
    }

    public String getKxo19Hex() {
        return kxo19Hex;
    }

    public void setKxo19Hex(String kxo19Hex) {
        this.kxo19Hex = kxo19Hex;
    }

    public BigDecimal getKyo19() {
        return kyo19;
    }

    public void setKyo19(BigDecimal kyo19) {
        this.kyo19 = kyo19;
    }

    public String getKyo19Hex() {
        return kyo19Hex;
    }

    public void setKyo19Hex(String kyo19Hex) {
        this.kyo19Hex = kyo19Hex;
    }

    public BigDecimal getTm19() {
        return tm19;
    }

    public void setTm19(BigDecimal tm19) {
        this.tm19 = tm19;
    }

    public String getTm19Hex() {
        return tm19Hex;
    }

    public void setTm19Hex(String tm19Hex) {
        this.tm19Hex = tm19Hex;
    }

    public BigDecimal getOx19() {
        return ox19;
    }

    public void setOx19(BigDecimal ox19) {
        this.ox19 = ox19;
    }

    public BigDecimal getOy19() {
        return oy19;
    }

    public void setOy19(BigDecimal oy19) {
        this.oy19 = oy19;
    }

    public BigDecimal getCi() {
        return ci;
    }

    public void setCi(BigDecimal ci) {
        this.ci = ci;
    }

    public BigDecimal getTi() {
        return ti;
    }

    public void setTi(BigDecimal ti) {
        this.ti = ti;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getDod() {
        return dod;
    }

    public void setDod(String dod) {
        this.dod = dod;
    }

    public String getInsIp() {
        return insIp;
    }

    public void setInsIp(String insIp) {
        this.insIp = insIp;
    }

    public LocalDateTime getInsTime() {
        return insTime;
    }

    public void setInsTime(LocalDateTime insTime) {
        this.insTime = insTime;
    }
}
