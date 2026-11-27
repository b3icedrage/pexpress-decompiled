package com.onesignal.notifications.services;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.AW1;
import defpackage.C1795Pt1;
import defpackage.C3027bp1;
import defpackage.C7766y91;
import defpackage.InterfaceC0934Et0;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC7289vu0;
import defpackage.JM;
import defpackage.LY1;
import defpackage.MN;
import defpackage.NS0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0014J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\tH\u0014J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0014¨\u0006\u000e"}, d2 = {"Lcom/onesignal/notifications/services/ADMMessageHandler;", "Lcom/amazon/device/messaging/ADMMessageHandlerBase;", "()V", "onMessage", "", "intent", "Landroid/content/Intent;", "onRegistered", "newRegistrationId", "", "onRegistrationError", "error", "onUnregistered", "info", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ADMMessageHandler extends ADMMessageHandlerBase {

    @InterfaceC3368dU(c = "com.onesignal.notifications.services.ADMMessageHandler$onRegistered$1", f = "ADMMessageHandler.kt", l = {UserVerificationMethods.USER_VERIFY_LOCATION}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ String $newRegistrationId;
        final /* synthetic */ C3027bp1<InterfaceC7289vu0> $registerer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3027bp1<InterfaceC7289vu0> c3027bp1, String str, JM<? super a> jm) {
            super(1, jm);
            this.$registerer = c3027bp1;
            this.$newRegistrationId = str;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return new a(this.$registerer, this.$newRegistrationId, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC7289vu0 interfaceC7289vu0 = this.$registerer.d;
                String str = this.$newRegistrationId;
                this.label = 1;
                if (interfaceC7289vu0.fireCallback(str, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.services.ADMMessageHandler$onRegistrationError$1", f = "ADMMessageHandler.kt", l = {47}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ C3027bp1<InterfaceC7289vu0> $registerer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3027bp1<InterfaceC7289vu0> c3027bp1, JM<? super b> jm) {
            super(1, jm);
            this.$registerer = c3027bp1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return new b(this.$registerer, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((b) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC7289vu0 interfaceC7289vu0 = this.$registerer.d;
                this.label = 1;
                if (interfaceC7289vu0.fireCallback(null, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    public void onMessage(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Context context = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        if (C7766y91.c(context)) {
            Bundle extras = intent.getExtras();
            InterfaceC0934Et0 interfaceC0934Et0 = (InterfaceC0934Et0) C7766y91.b().getService(InterfaceC0934Et0.class);
            Intrinsics.checkNotNull(extras);
            interfaceC0934Et0.processBundleFromReceiver(context, extras);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    public void onRegistered(@NotNull String newRegistrationId) {
        Intrinsics.checkNotNullParameter(newRegistrationId, "newRegistrationId");
        NS0.info$default("ADM registration ID: " + newRegistrationId, null, 2, null);
        C3027bp1 c3027bp1 = new C3027bp1();
        c3027bp1.d = C7766y91.b().getService(InterfaceC7289vu0.class);
        LY1.suspendifyOnThread$default(0, new a(c3027bp1, newRegistrationId, null), 1, null);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    public void onRegistrationError(@NotNull String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        NS0.error$default("ADM:onRegistrationError: " + error, null, 2, null);
        if ("INVALID_SENDER".equals(error)) {
            NS0.error$default("Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", null, 2, null);
        }
        C3027bp1 c3027bp1 = new C3027bp1();
        c3027bp1.d = C7766y91.b().getService(InterfaceC7289vu0.class);
        LY1.suspendifyOnThread$default(0, new b(c3027bp1, null), 1, null);
    }

    public void onUnregistered(@NotNull String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        NS0.info$default("ADM:onUnregistered: " + info, null, 2, null);
    }
}
