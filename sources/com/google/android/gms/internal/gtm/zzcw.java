package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.Logger;

/* JADX INFO: loaded from: classes.dex */
final class zzcw implements Logger {
    private int zza = 2;
    private boolean zzb;

    @Override // com.google.android.gms.analytics.Logger
    public final void error(Exception exc) {
    }

    @Override // com.google.android.gms.analytics.Logger
    public final int getLogLevel() {
        return this.zza;
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void info(String str) {
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void setLogLevel(int i) {
        this.zza = i;
        if (this.zzb) {
            return;
        }
        zzev zzevVar = zzew.zzc;
        this.zzb = true;
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void verbose(String str) {
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void warn(String str) {
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void error(String str) {
    }
}
