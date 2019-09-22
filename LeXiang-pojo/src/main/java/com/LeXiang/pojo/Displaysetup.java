package com.LeXiang.pojo;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

public class Displaysetup  implements Serializable {
    private Integer id;

    private Integer language;

    private Double largeproductimagewidth;

    private Double largeproductimageheight;

    private Double mediumproductimagewidth;

    private Double mediumproductimageheight;

    private Double thumbnailproductimagewidth;

    private Double thumbnailproductimageheight;

    private String defaultlargeproductimage;

    private String defaultmediumproductimage;

    private String defaultthumbnailproductimage;

    private String defaultstorelogo;

    private Integer watermarkalpha;

    private String watermarkimagefile;

    private Integer watermarkposition;

    private Integer pricescale;

    private Integer priceroundtype;

    private Integer isshowmarketprice;

    private Double defaultmarketpricescale;

    private String sitename;

    private String siteurl;

    private String logo;

    private String hotsearch;

    private String address;

    private String phone;

    private String zipcode;

    private String email;

    private String certtext;

    private String allowedregistertypes;

    private Integer registerpoint;

    private String captchatypes;

    private Integer maxfailedloginattempts;

    private Integer passwordlocktime;

    private Integer safekeyexpirytime;

    private Integer uploadmaxsize;

    private String uploadimageextension;

    private String uploadmediaextension;

    private String uploadfileextension;

    private String imageuploadpath;

    private String mediauploadpath;

    private String fileuploadpath;

    private String smtphost;

    private String smtpport;

    private String smtpusername;

    private String smtppassword;

    private String smtpsslenabled;

    private String smtpfrommail;

    private String tomail;

    private String currencysign;

    private String currencyunit;

    private Integer stockalertcount;

    private Integer automaticreceivetime;

    private Integer stockallocationtime;

    private Integer defaultpointscale;

    private Integer maxpointscale;

    private Integer isdevelopmentenabled;

    private Integer isreviewenabled;

    private Integer isreviewcheck;

    private Integer isconsultationenabled;

    private Integer isconsultationcheck;

    private Integer isinvoiceenabled;

    private Integer istaxpriceenabled;

    private Double taxrate;

    private String cookiepath;

    private String cookiedomain;

    private String kuaidi100key;

    private String smssn;

    private String smskey;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public Double getLargeproductimagewidth() {
        return largeproductimagewidth;
    }

    public void setLargeproductimagewidth(Double largeproductimagewidth) {
        this.largeproductimagewidth = largeproductimagewidth;
    }

    public Double getLargeproductimageheight() {
        return largeproductimageheight;
    }

    public void setLargeproductimageheight(Double largeproductimageheight) {
        this.largeproductimageheight = largeproductimageheight;
    }

    public Double getMediumproductimagewidth() {
        return mediumproductimagewidth;
    }

    public void setMediumproductimagewidth(Double mediumproductimagewidth) {
        this.mediumproductimagewidth = mediumproductimagewidth;
    }

    public Double getMediumproductimageheight() {
        return mediumproductimageheight;
    }

    public void setMediumproductimageheight(Double mediumproductimageheight) {
        this.mediumproductimageheight = mediumproductimageheight;
    }

    public Double getThumbnailproductimagewidth() {
        return thumbnailproductimagewidth;
    }

    public void setThumbnailproductimagewidth(Double thumbnailproductimagewidth) {
        this.thumbnailproductimagewidth = thumbnailproductimagewidth;
    }

    public Double getThumbnailproductimageheight() {
        return thumbnailproductimageheight;
    }

    public void setThumbnailproductimageheight(Double thumbnailproductimageheight) {
        this.thumbnailproductimageheight = thumbnailproductimageheight;
    }

    public String getDefaultlargeproductimage() {
        return defaultlargeproductimage;
    }

    public void setDefaultlargeproductimage(String defaultlargeproductimage) {
        this.defaultlargeproductimage = defaultlargeproductimage == null ? null : defaultlargeproductimage.trim();
    }

    public String getDefaultmediumproductimage() {
        return defaultmediumproductimage;
    }

    public void setDefaultmediumproductimage(String defaultmediumproductimage) {
        this.defaultmediumproductimage = defaultmediumproductimage == null ? null : defaultmediumproductimage.trim();
    }

    public String getDefaultthumbnailproductimage() {
        return defaultthumbnailproductimage;
    }

    public void setDefaultthumbnailproductimage(String defaultthumbnailproductimage) {
        this.defaultthumbnailproductimage = defaultthumbnailproductimage == null ? null : defaultthumbnailproductimage.trim();
    }

    public String getDefaultstorelogo() {
        return defaultstorelogo;
    }

    public void setDefaultstorelogo(String defaultstorelogo) {
        this.defaultstorelogo = defaultstorelogo == null ? null : defaultstorelogo.trim();
    }

    public Integer getWatermarkalpha() {
        return watermarkalpha;
    }

    public void setWatermarkalpha(Integer watermarkalpha) {
        this.watermarkalpha = watermarkalpha;
    }

    public String getWatermarkimagefile() {
        return watermarkimagefile;
    }

    public void setWatermarkimagefile(String watermarkimagefile) {
        this.watermarkimagefile = watermarkimagefile == null ? null : watermarkimagefile.trim();
    }

    public Integer getWatermarkposition() {
        return watermarkposition;
    }

    public void setWatermarkposition(Integer watermarkposition) {
        this.watermarkposition = watermarkposition;
    }

    public Integer getPricescale() {
        return pricescale;
    }

    public void setPricescale(Integer pricescale) {
        this.pricescale = pricescale;
    }

    public Integer getPriceroundtype() {
        return priceroundtype;
    }

    public void setPriceroundtype(Integer priceroundtype) {
        this.priceroundtype = priceroundtype;
    }

    public Integer getIsshowmarketprice() {
        return isshowmarketprice;
    }

    public void setIsshowmarketprice(Integer isshowmarketprice) {
        this.isshowmarketprice = isshowmarketprice;
    }

    public Double getDefaultmarketpricescale() {
        return defaultmarketpricescale;
    }

    public void setDefaultmarketpricescale(Double defaultmarketpricescale) {
        this.defaultmarketpricescale = defaultmarketpricescale;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename == null ? null : sitename.trim();
    }

    public String getSiteurl() {
        return siteurl;
    }

    public void setSiteurl(String siteurl) {
        this.siteurl = siteurl == null ? null : siteurl.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getHotsearch() {
        return hotsearch;
    }

    public void setHotsearch(String hotsearch) {
        this.hotsearch = hotsearch == null ? null : hotsearch.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCerttext() {
        return certtext;
    }

    public void setCerttext(String certtext) {
        this.certtext = certtext == null ? null : certtext.trim();
    }

    public String getAllowedregistertypes() {
        return allowedregistertypes;
    }

    public void setAllowedregistertypes(String allowedregistertypes) {
        this.allowedregistertypes = allowedregistertypes == null ? null : allowedregistertypes.trim();
    }

    public Integer getRegisterpoint() {
        return registerpoint;
    }

    public void setRegisterpoint(Integer registerpoint) {
        this.registerpoint = registerpoint;
    }

    public String getCaptchatypes() {
        return captchatypes;
    }

    public void setCaptchatypes(String captchatypes) {
        this.captchatypes = captchatypes == null ? null : captchatypes.trim();
    }

    public Integer getMaxfailedloginattempts() {
        return maxfailedloginattempts;
    }

    public void setMaxfailedloginattempts(Integer maxfailedloginattempts) {
        this.maxfailedloginattempts = maxfailedloginattempts;
    }

    public Integer getPasswordlocktime() {
        return passwordlocktime;
    }

    public void setPasswordlocktime(Integer passwordlocktime) {
        this.passwordlocktime = passwordlocktime;
    }

    public Integer getSafekeyexpirytime() {
        return safekeyexpirytime;
    }

    public void setSafekeyexpirytime(Integer safekeyexpirytime) {
        this.safekeyexpirytime = safekeyexpirytime;
    }

    public Integer getUploadmaxsize() {
        return uploadmaxsize;
    }

    public void setUploadmaxsize(Integer uploadmaxsize) {
        this.uploadmaxsize = uploadmaxsize;
    }

    public String getUploadimageextension() {
        return uploadimageextension;
    }

    public void setUploadimageextension(String uploadimageextension) {
        this.uploadimageextension = uploadimageextension == null ? null : uploadimageextension.trim();
    }

    public String getUploadmediaextension() {
        return uploadmediaextension;
    }

    public void setUploadmediaextension(String uploadmediaextension) {
        this.uploadmediaextension = uploadmediaextension == null ? null : uploadmediaextension.trim();
    }

    public String getUploadfileextension() {
        return uploadfileextension;
    }

    public void setUploadfileextension(String uploadfileextension) {
        this.uploadfileextension = uploadfileextension == null ? null : uploadfileextension.trim();
    }

    public String getImageuploadpath() {
        return imageuploadpath;
    }

    public void setImageuploadpath(String imageuploadpath) {
        this.imageuploadpath = imageuploadpath == null ? null : imageuploadpath.trim();
    }

    public String getMediauploadpath() {
        return mediauploadpath;
    }

    public void setMediauploadpath(String mediauploadpath) {
        this.mediauploadpath = mediauploadpath == null ? null : mediauploadpath.trim();
    }

    public String getFileuploadpath() {
        return fileuploadpath;
    }

    public void setFileuploadpath(String fileuploadpath) {
        this.fileuploadpath = fileuploadpath == null ? null : fileuploadpath.trim();
    }

    public String getSmtphost() {
        return smtphost;
    }

    public void setSmtphost(String smtphost) {
        this.smtphost = smtphost == null ? null : smtphost.trim();
    }

    public String getSmtpport() {
        return smtpport;
    }

    public void setSmtpport(String smtpport) {
        this.smtpport = smtpport == null ? null : smtpport.trim();
    }

    public String getSmtpusername() {
        return smtpusername;
    }

    public void setSmtpusername(String smtpusername) {
        this.smtpusername = smtpusername == null ? null : smtpusername.trim();
    }

    public String getSmtppassword() {
        return smtppassword;
    }

    public void setSmtppassword(String smtppassword) {
        this.smtppassword = smtppassword == null ? null : smtppassword.trim();
    }

    public String getSmtpsslenabled() {
        return smtpsslenabled;
    }

    public void setSmtpsslenabled(String smtpsslenabled) {
        this.smtpsslenabled = smtpsslenabled == null ? null : smtpsslenabled.trim();
    }

    public String getSmtpfrommail() {
        return smtpfrommail;
    }

    public void setSmtpfrommail(String smtpfrommail) {
        this.smtpfrommail = smtpfrommail == null ? null : smtpfrommail.trim();
    }

    public String getTomail() {
        return tomail;
    }

    public void setTomail(String tomail) {
        this.tomail = tomail == null ? null : tomail.trim();
    }

    public String getCurrencysign() {
        return currencysign;
    }

    public void setCurrencysign(String currencysign) {
        this.currencysign = currencysign == null ? null : currencysign.trim();
    }

    public String getCurrencyunit() {
        return currencyunit;
    }

    public void setCurrencyunit(String currencyunit) {
        this.currencyunit = currencyunit == null ? null : currencyunit.trim();
    }

    public Integer getStockalertcount() {
        return stockalertcount;
    }

    public void setStockalertcount(Integer stockalertcount) {
        this.stockalertcount = stockalertcount;
    }

    public Integer getAutomaticreceivetime() {
        return automaticreceivetime;
    }

    public void setAutomaticreceivetime(Integer automaticreceivetime) {
        this.automaticreceivetime = automaticreceivetime;
    }

    public Integer getStockallocationtime() {
        return stockallocationtime;
    }

    public void setStockallocationtime(Integer stockallocationtime) {
        this.stockallocationtime = stockallocationtime;
    }

    public Integer getDefaultpointscale() {
        return defaultpointscale;
    }

    public void setDefaultpointscale(Integer defaultpointscale) {
        this.defaultpointscale = defaultpointscale;
    }

    public Integer getMaxpointscale() {
        return maxpointscale;
    }

    public void setMaxpointscale(Integer maxpointscale) {
        this.maxpointscale = maxpointscale;
    }

    public Integer getIsdevelopmentenabled() {
        return isdevelopmentenabled;
    }

    public void setIsdevelopmentenabled(Integer isdevelopmentenabled) {
        this.isdevelopmentenabled = isdevelopmentenabled;
    }

    public Integer getIsreviewenabled() {
        return isreviewenabled;
    }

    public void setIsreviewenabled(Integer isreviewenabled) {
        this.isreviewenabled = isreviewenabled;
    }

    public Integer getIsreviewcheck() {
        return isreviewcheck;
    }

    public void setIsreviewcheck(Integer isreviewcheck) {
        this.isreviewcheck = isreviewcheck;
    }

    public Integer getIsconsultationenabled() {
        return isconsultationenabled;
    }

    public void setIsconsultationenabled(Integer isconsultationenabled) {
        this.isconsultationenabled = isconsultationenabled;
    }

    public Integer getIsconsultationcheck() {
        return isconsultationcheck;
    }

    public void setIsconsultationcheck(Integer isconsultationcheck) {
        this.isconsultationcheck = isconsultationcheck;
    }

    public Integer getIsinvoiceenabled() {
        return isinvoiceenabled;
    }

    public void setIsinvoiceenabled(Integer isinvoiceenabled) {
        this.isinvoiceenabled = isinvoiceenabled;
    }

    public Integer getIstaxpriceenabled() {
        return istaxpriceenabled;
    }

    public void setIstaxpriceenabled(Integer istaxpriceenabled) {
        this.istaxpriceenabled = istaxpriceenabled;
    }

    public Double getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(Double taxrate) {
        this.taxrate = taxrate;
    }

    public String getCookiepath() {
        return cookiepath;
    }

    public void setCookiepath(String cookiepath) {
        this.cookiepath = cookiepath == null ? null : cookiepath.trim();
    }

    public String getCookiedomain() {
        return cookiedomain;
    }

    public void setCookiedomain(String cookiedomain) {
        this.cookiedomain = cookiedomain == null ? null : cookiedomain.trim();
    }

    public String getKuaidi100key() {
        return kuaidi100key;
    }

    public void setKuaidi100key(String kuaidi100key) {
        this.kuaidi100key = kuaidi100key == null ? null : kuaidi100key.trim();
    }

    public String getSmssn() {
        return smssn;
    }

    public void setSmssn(String smssn) {
        this.smssn = smssn == null ? null : smssn.trim();
    }

    public String getSmskey() {
        return smskey;
    }

    public void setSmskey(String smskey) {
        this.smskey = smskey == null ? null : smskey.trim();
    }

    @Override
    public String toString() {
        return "Displaysetup{" +
                "id=" + id +
                ", language=" + language +
                ", largeproductimagewidth=" + largeproductimagewidth +
                ", largeproductimageheight=" + largeproductimageheight +
                ", mediumproductimagewidth=" + mediumproductimagewidth +
                ", mediumproductimageheight=" + mediumproductimageheight +
                ", thumbnailproductimagewidth=" + thumbnailproductimagewidth +
                ", thumbnailproductimageheight=" + thumbnailproductimageheight +
                ", defaultlargeproductimage='" + defaultlargeproductimage + '\'' +
                ", defaultmediumproductimage='" + defaultmediumproductimage + '\'' +
                ", defaultthumbnailproductimage='" + defaultthumbnailproductimage + '\'' +
                ", defaultstorelogo='" + defaultstorelogo + '\'' +
                ", watermarkalpha=" + watermarkalpha +
                ", watermarkimagefile='" + watermarkimagefile + '\'' +
                ", watermarkposition=" + watermarkposition +
                ", pricescale=" + pricescale +
                ", priceroundtype=" + priceroundtype +
                ", isshowmarketprice=" + isshowmarketprice +
                ", defaultmarketpricescale=" + defaultmarketpricescale +
                ", sitename='" + sitename + '\'' +
                ", siteurl='" + siteurl + '\'' +
                ", logo='" + logo + '\'' +
                ", hotsearch='" + hotsearch + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", email='" + email + '\'' +
                ", certtext='" + certtext + '\'' +
                ", allowedregistertypes='" + allowedregistertypes + '\'' +
                ", registerpoint=" + registerpoint +
                ", captchatypes='" + captchatypes + '\'' +
                ", maxfailedloginattempts=" + maxfailedloginattempts +
                ", passwordlocktime=" + passwordlocktime +
                ", safekeyexpirytime=" + safekeyexpirytime +
                ", uploadmaxsize=" + uploadmaxsize +
                ", uploadimageextension='" + uploadimageextension + '\'' +
                ", uploadmediaextension='" + uploadmediaextension + '\'' +
                ", uploadfileextension='" + uploadfileextension + '\'' +
                ", imageuploadpath='" + imageuploadpath + '\'' +
                ", mediauploadpath='" + mediauploadpath + '\'' +
                ", fileuploadpath='" + fileuploadpath + '\'' +
                ", smtphost='" + smtphost + '\'' +
                ", smtpport='" + smtpport + '\'' +
                ", smtpusername='" + smtpusername + '\'' +
                ", smtppassword='" + smtppassword + '\'' +
                ", smtpsslenabled='" + smtpsslenabled + '\'' +
                ", smtpfrommail='" + smtpfrommail + '\'' +
                ", tomail='" + tomail + '\'' +
                ", currencysign='" + currencysign + '\'' +
                ", currencyunit='" + currencyunit + '\'' +
                ", stockalertcount=" + stockalertcount +
                ", automaticreceivetime=" + automaticreceivetime +
                ", stockallocationtime=" + stockallocationtime +
                ", defaultpointscale=" + defaultpointscale +
                ", maxpointscale=" + maxpointscale +
                ", isdevelopmentenabled=" + isdevelopmentenabled +
                ", isreviewenabled=" + isreviewenabled +
                ", isreviewcheck=" + isreviewcheck +
                ", isconsultationenabled=" + isconsultationenabled +
                ", isconsultationcheck=" + isconsultationcheck +
                ", isinvoiceenabled=" + isinvoiceenabled +
                ", istaxpriceenabled=" + istaxpriceenabled +
                ", taxrate=" + taxrate +
                ", cookiepath='" + cookiepath + '\'' +
                ", cookiedomain='" + cookiedomain + '\'' +
                ", kuaidi100key='" + kuaidi100key + '\'' +
                ", smssn='" + smssn + '\'' +
                ", smskey='" + smskey + '\'' +
                '}';
    }
}