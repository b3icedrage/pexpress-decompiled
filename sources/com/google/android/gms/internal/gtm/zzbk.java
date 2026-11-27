package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zzbk extends zzbu {
    public static boolean zza;
    private AdvertisingIdClient.Info zzb;
    private final zzfq zzc;
    private String zzd;
    private boolean zze;
    private final Object zzf;

    public zzbk(zzbx zzbxVar) {
        super(zzbxVar);
        this.zze = false;
        this.zzf = new Object();
        this.zzc = new zzfq(zzbxVar.zzr());
    }

    private final synchronized AdvertisingIdClient.Info zzc() {
        AdvertisingIdClient.Info advertisingIdInfo;
        String str;
        IOException e;
        boolean zZzf;
        if (this.zzc.zzc(1000L)) {
            this.zzc.zzb();
            String id = null;
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzo());
            } catch (IllegalStateException unused) {
                zzQ("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
                advertisingIdInfo = null;
            } catch (Exception e2) {
                if (!zza) {
                    zza = true;
                    zzR("Error getting advertiser id", e2);
                }
                advertisingIdInfo = null;
            }
            AdvertisingIdClient.Info info = this.zzb;
            String id2 = advertisingIdInfo == null ? null : advertisingIdInfo.getId();
            if (!TextUtils.isEmpty(id2)) {
                String strZzb = zzv().zzb();
                synchronized (this.zzf) {
                    try {
                        if (!this.zze) {
                            try {
                                FileInputStream fileInputStreamOpenFileInput = zzo().openFileInput("gaClientIdData");
                                byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
                                int i = fileInputStreamOpenFileInput.read(bArr, 0, UserVerificationMethods.USER_VERIFY_PATTERN);
                                if (fileInputStreamOpenFileInput.available() > 0) {
                                    zzQ("Hash file seems corrupted, deleting it.");
                                    fileInputStreamOpenFileInput.close();
                                    zzo().deleteFile("gaClientIdData");
                                } else if (i <= 0) {
                                    zzN("Hash file is empty.");
                                    fileInputStreamOpenFileInput.close();
                                } else {
                                    str = new String(bArr, 0, i);
                                    try {
                                        fileInputStreamOpenFileInput.close();
                                    } catch (FileNotFoundException unused2) {
                                    } catch (IOException e3) {
                                        e = e3;
                                        zzR("Error reading Hash file, deleting it", e);
                                        zzo().deleteFile("gaClientIdData");
                                    }
                                    id = str;
                                }
                            } catch (FileNotFoundException unused3) {
                            } catch (IOException e4) {
                                str = null;
                                e = e4;
                            }
                            this.zzd = id;
                            this.zze = true;
                        } else if (TextUtils.isEmpty(this.zzd)) {
                            if (info != null) {
                                id = info.getId();
                            }
                            if (id == null) {
                                zZzf = zzf(id2 + strZzb);
                            } else {
                                this.zzd = zze(id + strZzb);
                            }
                            if (!zZzf) {
                                zzI("Failed to reset client id on adid change. Not using adid");
                                this.zzb = new AdvertisingIdClient.Info("", false);
                            }
                        }
                        String strZze = zze(id2 + strZzb);
                        if (!TextUtils.isEmpty(strZze)) {
                            if (!strZze.equals(this.zzd)) {
                                if (!TextUtils.isEmpty(this.zzd)) {
                                    zzN("Resetting the client id because Advertising Id changed.");
                                    strZzb = zzv().zze();
                                    zzO("New client Id", strZzb);
                                }
                                zZzf = zzf(id2 + strZzb);
                                if (!zZzf) {
                                }
                            }
                        }
                        zzI("Failed to reset client id on adid change. Not using adid");
                        this.zzb = new AdvertisingIdClient.Info("", false);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.zzb = advertisingIdInfo;
        }
        return this.zzb;
    }

    private static String zze(String str) {
        MessageDigest messageDigestZze = zzfu.zze("MD5");
        if (messageDigestZze == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestZze.digest(str.getBytes())));
    }

    private final boolean zzf(String str) {
        try {
            String strZze = zze(str);
            zzN("Storing hashed adid.");
            FileOutputStream fileOutputStreamOpenFileOutput = zzo().openFileOutput("gaClientIdData", 0);
            fileOutputStreamOpenFileOutput.write(strZze.getBytes());
            fileOutputStreamOpenFileOutput.close();
            this.zzd = strZze;
            return true;
        } catch (IOException e) {
            zzJ("Error creating hash file", e);
            return false;
        }
    }

    public final String zza() {
        zzV();
        AdvertisingIdClient.Info infoZzc = zzc();
        String id = infoZzc != null ? infoZzc.getId() : null;
        if (TextUtils.isEmpty(id)) {
            return null;
        }
        return id;
    }

    public final boolean zzb() {
        zzV();
        AdvertisingIdClient.Info infoZzc = zzc();
        return (infoZzc == null || infoZzc.isLimitAdTrackingEnabled()) ? false : true;
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    public final void zzd() {
    }
}
