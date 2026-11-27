package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;

/* JADX INFO: loaded from: classes.dex */
public final class zzcc {
    private static UserManager zza;
    private static volatile boolean zzb = !zzb();

    private zzcc() {
    }

    /* JADX WARN: Code duplicated, block: B:32:0x004c A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:9:0x000f, B:11:0x0013, B:18:0x001d, B:20:0x0021, B:21:0x002b, B:34:0x0050, B:35:0x0052, B:24:0x0031, B:26:0x0037, B:32:0x004c, B:30:0x0045), top: B:41:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0050 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:9:0x000f, B:11:0x0013, B:18:0x001d, B:20:0x0021, B:21:0x002b, B:34:0x0050, B:35:0x0052, B:24:0x0031, B:26:0x0037, B:32:0x004c, B:30:0x0045), top: B:41:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0055 A[RETURN] */
    public static boolean zza(Context context) {
        boolean z;
        if (zzb() && !zzb) {
            synchronized (zzcc.class) {
                try {
                    if (!zzb) {
                        int i = 1;
                        while (true) {
                            if (i <= 2) {
                                if (zza == null) {
                                    zza = (UserManager) context.getSystemService(UserManager.class);
                                }
                                UserManager userManager = zza;
                                if (userManager == null) {
                                    z = true;
                                } else {
                                    try {
                                        if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                            z = true;
                                        }
                                        if (z) {
                                            zza = null;
                                        }
                                    } catch (NullPointerException unused) {
                                        zza = null;
                                        i++;
                                    }
                                }
                                if (z) {
                                    zzb = true;
                                }
                                if (!z) {
                                    return true;
                                }
                            }
                            z = false;
                            if (z) {
                                zza = null;
                            }
                            if (z) {
                                zzb = true;
                            }
                            if (!z) {
                                return true;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return false;
    }

    public static boolean zzb() {
        return true;
    }
}
