package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(14)
final class zzhw implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzhx zza;

    public /* synthetic */ zzhw(zzhx zzhxVar, zzhv zzhvVar) {
        this.zza = zzhxVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        zzhw zzhwVar;
        zzfr zzfrVar;
        try {
            try {
                this.zza.zzt.zzay().zzj().zza("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    zzfrVar = this.zza.zzt;
                } else {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        zzfrVar = this.zza.zzt;
                    } else {
                        this.zza.zzt.zzv();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        String str = ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto";
                        String queryParameter = data.getQueryParameter(Payload.RFR);
                        zzhwVar = this;
                        try {
                            this.zza.zzt.zzaz().zzp(new zzhu(zzhwVar, bundle == null, data, str, queryParameter));
                            zzfrVar = zzhwVar.zza.zzt;
                        } catch (RuntimeException e) {
                            e = e;
                            zzhwVar.zza.zzt.zzay().zzd().zzb("Throwable caught in onActivityCreated", e);
                            zzfrVar = zzhwVar.zza.zzt;
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                zzhwVar.zza.zzt.zzs().zzr(activity, bundle);
                throw th;
            }
        } catch (RuntimeException e2) {
            e = e2;
            zzhwVar = this;
        } catch (Throwable th2) {
            th = th2;
            zzhwVar = this;
            zzhwVar.zza.zzt.zzs().zzr(activity, bundle);
            throw th;
        }
        zzfrVar.zzs().zzr(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzt.zzs().zzs(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.zza.zzt.zzs().zzt(activity);
        zzkc zzkcVarZzu = this.zza.zzt.zzu();
        zzkcVarZzu.zzt.zzaz().zzp(new zzjv(zzkcVarZzu, zzkcVarZzu.zzt.zzav().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzkc zzkcVarZzu = this.zza.zzt.zzu();
        zzkcVarZzu.zzt.zzaz().zzp(new zzju(zzkcVarZzu, zzkcVarZzu.zzt.zzav().elapsedRealtime()));
        this.zza.zzt.zzs().zzu(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzt.zzs().zzv(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
