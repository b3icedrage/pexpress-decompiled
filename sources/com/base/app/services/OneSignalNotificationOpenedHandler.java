package com.base.app.services;

import com.api.feature.analytics.reporters.ReporterApi;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.onesignal.notifications.INotificationClickEvent;
import defpackage.C7766y91;
import defpackage.EnumC5028l80;
import defpackage.EnumC5326ma;
import defpackage.H91;
import defpackage.InterfaceC1090Gt0;
import defpackage.VE;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/base/app/services/OneSignalNotificationOpenedHandler;", "LGt0;", "Lcom/api/feature/analytics/reporters/ReporterApi;", "reporter", "<init>", "(Lcom/api/feature/analytics/reporters/ReporterApi;)V", "Lcom/onesignal/notifications/INotificationClickEvent;", "event", "", "onClick", "(Lcom/onesignal/notifications/INotificationClickEvent;)V", "Lcom/api/feature/analytics/reporters/ReporterApi;", "AppBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OneSignalNotificationOpenedHandler implements InterfaceC1090Gt0 {

    @NotNull
    private final ReporterApi reporter;

    public OneSignalNotificationOpenedHandler(@NotNull ReporterApi reporter) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.reporter = reporter;
    }

    @Override // defpackage.InterfaceC1090Gt0
    public void onClick(@NotNull INotificationClickEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        JsonElement jsonElementL = new Gson().l(event.getNotification());
        jsonElementL.getClass();
        JsonObject jsonObjectD = jsonElementL instanceof JsonObject ? jsonElementL.d() : null;
        JsonElement jsonElementL2 = new Gson().l(String.valueOf(event.getNotification().getAdditionalData()));
        jsonElementL2.getClass();
        JsonObject jsonObjectD2 = jsonElementL2 instanceof JsonObject ? jsonElementL2.d() : null;
        if (jsonObjectD != null) {
            if (jsonObjectD2 != null) {
                H91 h91 = H91.PLATFORM;
                JsonElement jsonElementH = jsonObjectD2.h("trigger_inapp");
                String strF = (jsonElementH != null && (jsonElementH instanceof JsonPrimitive) && (jsonElementH.e().d instanceof String)) ? jsonElementH.f() : null;
                if (strF == null) {
                    strF = "";
                }
                if (strF.length() > 0) {
                    C7766y91.a().getInAppMessages().mo21addTrigger("trigger_inapp", strF);
                }
            }
            this.reporter.m(EnumC5028l80.u0, jsonObjectD, VE.c(EnumC5326ma.g), null);
        }
        Objects.toString(jsonObjectD);
    }
}
