package com.onesignal.notifications.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.AW1;
import defpackage.C1795Pt1;
import defpackage.C3027bp1;
import defpackage.C7766y91;
import defpackage.InterfaceC1872Qt0;
import defpackage.InterfaceC3368dU;
import defpackage.JM;
import defpackage.LY1;
import defpackage.MN;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/onesignal/notifications/receivers/NotificationDismissReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NotificationDismissReceiver extends BroadcastReceiver {

    @InterfaceC3368dU(c = "com.onesignal.notifications.receivers.NotificationDismissReceiver$onReceive$1", f = "NotificationDismissReceiver.kt", l = {46}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ C3027bp1<InterfaceC1872Qt0> $notificationOpenedProcessor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3027bp1<InterfaceC1872Qt0> c3027bp1, Context context, Intent intent, JM<? super a> jm) {
            super(1, jm);
            this.$notificationOpenedProcessor = c3027bp1;
            this.$context = context;
            this.$intent = intent;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return new a(this.$notificationOpenedProcessor, this.$context, this.$intent, jm);
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
                InterfaceC1872Qt0 interfaceC1872Qt0 = this.$notificationOpenedProcessor.d;
                Context context = this.$context;
                Intent intent = this.$intent;
                this.label = 1;
                if (interfaceC1872Qt0.processFromContext(context, intent, this) == mn) {
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

    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        if (C7766y91.c(applicationContext)) {
            C3027bp1 c3027bp1 = new C3027bp1();
            c3027bp1.d = C7766y91.b().getService(InterfaceC1872Qt0.class);
            LY1.suspendifyBlocking(new a(c3027bp1, context, intent, null));
        }
    }
}
