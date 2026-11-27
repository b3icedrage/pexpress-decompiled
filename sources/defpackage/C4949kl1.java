package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R \u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkl1;", "Luu0;", "Lvu0;", "Lws0;", "_deviceService", "LWr0;", "_applicationService", "<init>", "(Lws0;LWr0;)V", "Landroid/content/Context;", "context", "Luu0$a;", "getHMSTokenTask", "(Landroid/content/Context;LJM;)Ljava/lang/Object;", "registerForPush", "(LJM;)Ljava/lang/Object;", "", "id", "", "fireCallback", "(Ljava/lang/String;LJM;)Ljava/lang/Object;", "Lws0;", "LWr0;", "Lzf2;", "waiter", "Lzf2;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C4949kl1 implements InterfaceC7079uu0, InterfaceC7289vu0 {

    @NotNull
    private static final String HMS_CLIENT_APP_ID = "client/app_id";

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC7494ws0 _deviceService;

    @Nullable
    private C8079zf2<String> waiter;

    /* JADX INFO: renamed from: kl1$b */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorHMS", f = "PushRegistratorHMS.kt", l = {77}, m = "getHMSTokenTask")
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
            return C4949kl1.this.getHMSTokenTask(null, this);
        }
    }

    /* JADX INFO: renamed from: kl1$c */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorHMS$getHMSTokenTask$2", f = "PushRegistratorHMS.kt", l = {78}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ C3027bp1<String> $pushToken;
        Object L$0;
        int label;
        final /* synthetic */ C4949kl1 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C3027bp1<String> c3027bp1, C4949kl1 c4949kl1, JM<? super c> jm) {
            super(2, jm);
            this.$pushToken = c3027bp1;
            this.this$0 = c4949kl1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new c(this.$pushToken, this.this$0, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C3027bp1<String> c3027bp1;
            T t;
            C3027bp1<String> c3027bp2;
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                c3027bp1 = this.$pushToken;
                C8079zf2 c8079zf2 = this.this$0.waiter;
                if (c8079zf2 != null) {
                    this.L$0 = c3027bp1;
                    this.label = 1;
                    Object objWaitForWake = c8079zf2.waitForWake(this);
                    if (objWaitForWake == mn) {
                        return mn;
                    }
                    c3027bp2 = c3027bp1;
                    obj = objWaitForWake;
                } else {
                    t = 0;
                }
                c3027bp1.d = t;
                return Unit.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3027bp2 = (C3027bp1) this.L$0;
            C1795Pt1.b(obj);
            C3027bp1<String> c3027bp3 = c3027bp2;
            t = (String) obj;
            c3027bp1 = c3027bp3;
            c3027bp1.d = t;
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: kl1$d */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorHMS", f = "PushRegistratorHMS.kt", l = {34}, m = "registerForPush")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends LM {
        int label;
        /* synthetic */ Object result;

        public d(JM<? super d> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C4949kl1.this.registerForPush(this);
        }
    }

    public C4949kl1(@NotNull InterfaceC7494ws0 _deviceService, @NotNull InterfaceC2338Wr0 _applicationService) {
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        this._deviceService = _deviceService;
        this._applicationService = _applicationService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x001b A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:12:0x0020, B:15:0x002d, B:33:0x00ae, B:35:0x00b2, B:36:0x00d1, B:16:0x0036, B:17:0x003d, B:18:0x003e, B:20:0x0049, B:23:0x0052, B:25:0x007a, B:28:0x009a, B:11:0x001b), top: B:41:0x0005 }] */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, java.lang.CharSequence, java.lang.String] */
    public final synchronized Object getHMSTokenTask(Context context, JM<? super InterfaceC7079uu0.a> jm) {
        b bVar;
        C3027bp1 c3027bp1;
        InterfaceC7079uu0.a aVar;
        try {
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
            Object obj = bVar.result;
            MN mn = MN.d;
            int i2 = bVar.label;
            if (i2 == 0) {
                C1795Pt1.b(obj);
                if (!this._deviceService.getHasAllHMSLibrariesForPushKit()) {
                    return new InterfaceC7079uu0.a(null, GU1.MISSING_HMS_PUSHKIT_LIBRARY);
                }
                this.waiter = new C8079zf2<>();
                String string = AGConnectServicesConfig.fromContext(context).getString(HMS_CLIENT_APP_ID);
                HmsInstanceId hmsInstanceId = HmsInstanceId.getInstance(context);
                C3027bp1 c3027bp2 = new C3027bp1();
                ?? token = hmsInstanceId.getToken(string, "HCM");
                c3027bp2.d = token;
                if (!TextUtils.isEmpty(token)) {
                    NS0.info$default("Device registered for HMS, push token = " + ((String) c3027bp2.d), null, 2, null);
                    return new InterfaceC7079uu0.a((String) c3027bp2.d, GU1.SUBSCRIBED);
                }
                c cVar = new c(c3027bp2, this, null);
                bVar.L$0 = c3027bp2;
                bVar.label = 1;
                if (OZ1.b(30000L, cVar, bVar) == mn) {
                    return mn;
                }
                c3027bp1 = c3027bp2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3027bp1 = (C3027bp1) bVar.L$0;
                C1795Pt1.b(obj);
            }
            if (c3027bp1.d != null) {
                NS0.error$default("HMS registered with ID:" + ((String) c3027bp1.d), null, 2, null);
                aVar = new InterfaceC7079uu0.a((String) c3027bp1.d, GU1.SUBSCRIBED);
            } else {
                NS0.error$default("HmsMessageServiceOneSignal.onNewToken timed out.", null, 2, null);
                aVar = new InterfaceC7079uu0.a(null, GU1.HMS_TOKEN_TIMEOUT);
            }
            return aVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC7289vu0
    @Nullable
    public Object fireCallback(@Nullable String str, @NotNull JM<? super Unit> jm) {
        C8079zf2<String> c8079zf2 = this.waiter;
        if (c8079zf2 != null) {
            c8079zf2.wake(str);
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC7079uu0
    @Nullable
    public Object registerForPush(@NotNull JM<? super InterfaceC7079uu0.a> jm) {
        d dVar;
        InterfaceC7079uu0.a aVar;
        if (jm instanceof d) {
            dVar = (d) jm;
            int i = dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.label = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(jm);
            }
        } else {
            dVar = new d(jm);
        }
        Object hMSTokenTask = dVar.result;
        Object obj = MN.d;
        int i2 = dVar.label;
        try {
            if (i2 == 0) {
                C1795Pt1.b(hMSTokenTask);
                Context appContext = this._applicationService.getAppContext();
                dVar.label = 1;
                hMSTokenTask = getHMSTokenTask(appContext, dVar);
                if (hMSTokenTask == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(hMSTokenTask);
            }
            aVar = (InterfaceC7079uu0.a) hMSTokenTask;
        } catch (ApiException e) {
            NS0.error("HMS ApiException getting Huawei push token!", e);
            aVar = new InterfaceC7079uu0.a(null, e.getStatusCode() == 907135000 ? GU1.HMS_ARGUMENTS_INVALID : GU1.HMS_API_EXCEPTION_OTHER);
        }
        Intrinsics.checkNotNull(aVar);
        return aVar;
    }
}
