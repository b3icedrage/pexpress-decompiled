package com.base.app.services;

import android.content.Context;
import com.api.core.backend.domain.models.other.RawCouponData;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.onesignal.notifications.INotificationReceivedEvent;
import defpackage.C0957Fb;
import defpackage.C3362dS;
import defpackage.C3476e;
import defpackage.C5207m;
import defpackage.C7279vr;
import defpackage.C7700xr;
import defpackage.EnumC5028l80;
import defpackage.EnumC5326ma;
import defpackage.InterfaceC2526Yt0;
import defpackage.U0;
import defpackage.VE;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/base/app/services/OneSignalNotificationReceivedHandler;", "LYt0;", "<init>", "()V", "Lcom/onesignal/notifications/INotificationReceivedEvent;", "event", "", "onNotificationReceived", "(Lcom/onesignal/notifications/INotificationReceivedEvent;)V", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "AppBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OneSignalNotificationReceivedHandler implements InterfaceC2526Yt0 {

    @NotNull
    private final Gson gson = new Gson();

    @Override // defpackage.InterfaceC2526Yt0
    public void onNotificationReceived(@NotNull INotificationReceivedEvent event) {
        String string;
        Intrinsics.checkNotNullParameter(event, "event");
        JsonElement jsonElementL = this.gson.l(event.getNotification());
        jsonElementL.getClass();
        JsonObject jsonObjectD = jsonElementL instanceof JsonObject ? jsonElementL.d() : null;
        JSONObject additionalData = event.getNotification().getAdditionalData();
        RawCouponData rawCouponData = (additionalData == null || (string = additionalData.toString()) == null) ? null : (RawCouponData) C3476e.i(this.gson, string, RawCouponData.class);
        if (jsonObjectD != null) {
            Context context = event.getContext();
            Intrinsics.checkNotNullParameter(context, "context");
            if (C7279vr.d == null) {
                C7279vr.d = new C3362dS(new C7700xr(context), new C0957Fb(), new U0(10), new C7279vr(), new C5207m());
            }
            C3362dS c3362dS = C7279vr.d;
            Intrinsics.checkNotNull(c3362dS);
            c3362dS.S.get().m(EnumC5028l80.v0, jsonObjectD, VE.c(EnumC5326ma.g), null);
        }
        if (rawCouponData != null) {
            Context context2 = event.getContext();
            Intrinsics.checkNotNullParameter(context2, "context");
            if (C7279vr.d == null) {
                C7279vr.d = new C3362dS(new C7700xr(context2), new C0957Fb(), new U0(10), new C7279vr(), new C5207m());
            }
            C3362dS c3362dS2 = C7279vr.d;
            Intrinsics.checkNotNull(c3362dS2);
            c3362dS2.a0.get().c(rawCouponData);
        }
        Objects.toString(jsonObjectD);
    }
}
