package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class zzcp extends zzbu {
    private volatile String zza;
    private Future zzb;

    public zzcp(zzbx zzbxVar) {
        super(zzbxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzf() {
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        try {
            Context contextZza = zzq().zza();
            Preconditions.checkNotEmpty(lowerCase);
            Preconditions.checkNotMainThread("ClientId should be saved from worker thread");
            FileOutputStream fileOutputStreamOpenFileOutput = null;
            try {
                try {
                    try {
                        zzO("Storing clientId", lowerCase);
                        fileOutputStreamOpenFileOutput = contextZza.openFileOutput("gaClientId", 0);
                        fileOutputStreamOpenFileOutput.write(lowerCase.getBytes());
                        try {
                            fileOutputStreamOpenFileOutput.close();
                            return lowerCase;
                        } catch (IOException e) {
                            zzJ("Failed to close clientId writing stream", e);
                            return lowerCase;
                        }
                    } catch (FileNotFoundException e2) {
                        zzJ("Error creating clientId file", e2);
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException e3) {
                                e = e3;
                                zzJ("Failed to close clientId writing stream", e);
                                return "0";
                            }
                        }
                        return "0";
                    }
                } catch (IOException e4) {
                    zzJ("Error writing to clientId file", e4);
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException e5) {
                            e = e5;
                            zzJ("Failed to close clientId writing stream", e);
                            return "0";
                        }
                    }
                    return "0";
                }
            } catch (Throwable th) {
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException e6) {
                        zzJ("Failed to close clientId writing stream", e6);
                    }
                }
                throw th;
            }
        } catch (Exception e7) {
            zzJ("Error saving clientId file", e7);
            return "0";
        }
    }

    public final String zzb() {
        String str;
        zzV();
        synchronized (this) {
            try {
                if (this.zza == null) {
                    this.zzb = zzq().zzg(new zzcn(this));
                }
                Future future = this.zzb;
                if (future != null) {
                    try {
                        this.zza = (String) future.get();
                    } catch (InterruptedException e) {
                        zzR("ClientId loading or generation was interrupted", e);
                        this.zza = "0";
                    } catch (ExecutionException e2) {
                        zzJ("Failed to load or generate client id", e2);
                        this.zza = "0";
                    }
                    if (this.zza == null) {
                        this.zza = "0";
                    }
                    zzO("Loaded clientId", this.zza);
                    this.zzb = null;
                }
                str = this.zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: Removed unreachable split cross block B:60:0x008c */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093 A[RETURN] */
    public final String zzc() throws Throwable {
        FileInputStream fileInputStreamOpenFileInput;
        Context contextZza = zzq().zza();
        Preconditions.checkNotMainThread("ClientId should be loaded from worker thread");
        FileInputStream fileInputStream = null;
        str = null;
        str = null;
        str = null;
        String str = null;
        try {
            try {
                try {
                    fileInputStreamOpenFileInput = contextZza.openFileInput("gaClientId");
                    try {
                        byte[] bArr = new byte[36];
                        int i = fileInputStreamOpenFileInput.read(bArr, 0, 36);
                        if (fileInputStreamOpenFileInput.available() <= 0) {
                            if (i < 14) {
                                zzQ("clientId file is empty, deleting it.");
                                fileInputStreamOpenFileInput.close();
                                contextZza.deleteFile("gaClientId");
                                fileInputStreamOpenFileInput.close();
                            } else {
                                fileInputStreamOpenFileInput.close();
                                String str2 = new String(bArr, 0, i);
                                zzO("Read client id from disk", str2);
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException e) {
                                    zzJ("Failed to close client id reading stream", e);
                                }
                                str = str2;
                            }
                            if (str == null) {
                                return zzf();
                            }
                            return str;
                        }
                        zzQ("clientId file seems corrupted, deleting it.");
                        fileInputStreamOpenFileInput.close();
                        contextZza.deleteFile("gaClientId");
                        fileInputStreamOpenFileInput.close();
                    } catch (FileNotFoundException unused) {
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        if (str == null) {
                            return zzf();
                        }
                        return str;
                    } catch (IOException e2) {
                        e = e2;
                        zzJ("Error reading client id file, deleting it", e);
                        contextZza.deleteFile("gaClientId");
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        if (str == null) {
                            return zzf();
                        }
                        return str;
                    }
                } catch (IOException e3) {
                    zzJ("Failed to close client id reading stream", e3);
                }
            } catch (FileNotFoundException unused2) {
                fileInputStreamOpenFileInput = null;
            } catch (IOException e4) {
                e = e4;
                fileInputStreamOpenFileInput = null;
            } catch (Throwable th) {
                th = th;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e5) {
                        zzJ("Failed to close client id reading stream", e5);
                    }
                }
                throw th;
            }
            if (str == null) {
                return zzf();
            }
            return str;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = fileInputStreamOpenFileInput;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    public final void zzd() {
    }

    public final String zze() {
        synchronized (this) {
            this.zza = null;
            this.zzb = zzq().zzg(new zzco(this));
        }
        return zzb();
    }
}
