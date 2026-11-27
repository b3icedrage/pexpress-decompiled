package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lpl1;", "Lyu0;", "Luu0;", "_pushRegistrator", "Lws0;", "_deviceService", "<init>", "(Luu0;Lws0;)V", "LGU1;", "status", "", "pushStatusRuntimeError", "(LGU1;)Z", "Lql1;", "retrievePushToken", "(LJM;)Ljava/lang/Object;", "Luu0;", "Lws0;", "pushTokenStatus", "LGU1;", "getPushTokenStatus", "()LGU1;", "setPushTokenStatus", "(LGU1;)V", "", "pushToken", "Ljava/lang/String;", "getPushToken", "()Ljava/lang/String;", "setPushToken", "(Ljava/lang/String;)V", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C6002pl1 implements InterfaceC7920yu0 {

    @NotNull
    private final InterfaceC7494ws0 _deviceService;

    @NotNull
    private final InterfaceC7079uu0 _pushRegistrator;

    @Nullable
    private String pushToken;

    @NotNull
    private GU1 pushTokenStatus;

    /* JADX INFO: renamed from: pl1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InterfaceC7494ws0.b.values().length];
            iArr[InterfaceC7494ws0.b.MISSING.ordinal()] = 1;
            iArr[InterfaceC7494ws0.b.OUTDATED.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: pl1$b */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.pushtoken.PushTokenManager", f = "PushTokenManager.kt", l = {31}, m = "retrievePushToken")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(JM<? super b> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C6002pl1.this.retrievePushToken(this);
        }
    }

    public C6002pl1(@NotNull InterfaceC7079uu0 _pushRegistrator, @NotNull InterfaceC7494ws0 _deviceService) {
        Intrinsics.checkNotNullParameter(_pushRegistrator, "_pushRegistrator");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        this._pushRegistrator = _pushRegistrator;
        this._deviceService = _deviceService;
        this.pushTokenStatus = GU1.NO_PERMISSION;
    }

    private final boolean pushStatusRuntimeError(GU1 status) {
        return status.getValue() < -6;
    }

    @Nullable
    public final String getPushToken() {
        return this.pushToken;
    }

    @NotNull
    public final GU1 getPushTokenStatus() {
        return this.pushTokenStatus;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC7920yu0
    @Nullable
    public Object retrievePushToken(@NotNull JM<? super C6212ql1> jm) {
        b bVar;
        C6002pl1 c6002pl1;
        GU1 gu1;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i = bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.label = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(jm);
            }
        } else {
            bVar = new b(jm);
        }
        Object objRegisterForPush = bVar.result;
        MN mn = MN.d;
        int i2 = bVar.label;
        if (i2 == 0) {
            C1795Pt1.b(objRegisterForPush);
            int i3 = a.$EnumSwitchMapping$0[this._deviceService.getJetpackLibraryStatus().ordinal()];
            if (i3 == 1) {
                NS0.fatal$default("Could not find the Jetpack/AndroidX. Please make sure it has been correctly added to your project.", null, 2, null);
                this.pushTokenStatus = GU1.MISSING_JETPACK_LIBRARY;
            } else if (i3 != 2) {
                InterfaceC7079uu0 interfaceC7079uu0 = this._pushRegistrator;
                bVar.L$0 = this;
                bVar.label = 1;
                objRegisterForPush = interfaceC7079uu0.registerForPush(bVar);
                if (objRegisterForPush == mn) {
                    return mn;
                }
                c6002pl1 = this;
            } else {
                NS0.fatal$default("The included Jetpack/AndroidX Library is too old or incomplete.", null, 2, null);
                this.pushTokenStatus = GU1.OUTDATED_JETPACK_LIBRARY;
            }
            c6002pl1 = this;
            return new C6212ql1(c6002pl1.pushToken, c6002pl1.pushTokenStatus);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c6002pl1 = (C6002pl1) bVar.L$0;
        C1795Pt1.b(objRegisterForPush);
        InterfaceC7079uu0.a aVar = (InterfaceC7079uu0.a) objRegisterForPush;
        int value = aVar.getStatus().getValue();
        GU1 gu2 = GU1.SUBSCRIBED;
        if (value == gu2.getValue()) {
            c6002pl1.pushTokenStatus = aVar.getStatus();
        } else if (aVar.getStatus().getValue() < gu2.getValue()) {
            if (c6002pl1.pushToken == null && ((gu1 = c6002pl1.pushTokenStatus) == GU1.NO_PERMISSION || c6002pl1.pushStatusRuntimeError(gu1))) {
                c6002pl1.pushTokenStatus = aVar.getStatus();
            }
        } else if (c6002pl1.pushStatusRuntimeError(c6002pl1.pushTokenStatus)) {
            c6002pl1.pushTokenStatus = aVar.getStatus();
        }
        c6002pl1.pushToken = aVar.getId();
        return new C6212ql1(c6002pl1.pushToken, c6002pl1.pushTokenStatus);
    }

    public final void setPushToken(@Nullable String str) {
        this.pushToken = str;
    }

    public final void setPushTokenStatus(@NotNull GU1 gu1) {
        Intrinsics.checkNotNullParameter(gu1, "<set-?>");
        this.pushTokenStatus = gu1;
    }
}
