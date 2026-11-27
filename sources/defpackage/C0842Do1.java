package defpackage;

import com.google.android.gms.common.api.CommonStatusCodes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Do1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"LDo1;", "LAu0;", "Lws0;", "_deviceService", "LDt0;", "_backend", "<init>", "(Lws0;LDt0;)V", "", "appId", "subscriptionId", "notificationId", "", "sendReceiveReceipt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LJM;)Ljava/lang/Object;", "Lws0;", "LDt0;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C0842Do1 implements InterfaceC0625Au0 {

    @NotNull
    private final InterfaceC0856Dt0 _backend;

    @NotNull
    private final InterfaceC7494ws0 _deviceService;

    /* JADX INFO: renamed from: Do1$a */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptProcessor", f = "ReceiveReceiptProcessor.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "sendReceiveReceipt")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends LM {
        int label;
        /* synthetic */ Object result;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C0842Do1.this.sendReceiveReceipt(null, null, null, this);
        }
    }

    public C0842Do1(@NotNull InterfaceC7494ws0 _deviceService, @NotNull InterfaceC0856Dt0 _backend) {
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_backend, "_backend");
        this._deviceService = _deviceService;
        this._backend = _backend;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.InterfaceC0625Au0
    @Nullable
    public Object sendReceiveReceipt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull JM<? super Unit> jm) {
        a aVar;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.label = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        a aVar2 = aVar;
        Object obj = aVar2.result;
        MN mn = MN.d;
        int i2 = aVar2.label;
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                InterfaceC7494ws0.a deviceType = this._deviceService.getDeviceType();
                InterfaceC0856Dt0 interfaceC0856Dt0 = this._backend;
                aVar2.label = 1;
                if (interfaceC0856Dt0.updateNotificationAsReceived(str, str3, str2, deviceType, aVar2) == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
        } catch (C7063up e) {
            NS0.error$default("Receive receipt failed with statusCode: " + e.getStatusCode() + " response: " + e.getResponse(), null, 2, null);
        }
        return Unit.a;
    }
}
