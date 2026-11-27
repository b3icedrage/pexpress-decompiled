package defpackage;

import com.amazon.device.messaging.ADM;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR \u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lhl1;", "Luu0;", "Lvu0;", "LWr0;", "_applicationService", "<init>", "(LWr0;)V", "Luu0$a;", "registerForPush", "(LJM;)Ljava/lang/Object;", "", "id", "", "fireCallback", "(Ljava/lang/String;LJM;)Ljava/lang/Object;", "LWr0;", "Lzf2;", "waiter", "Lzf2;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C4271hl1 implements InterfaceC7079uu0, InterfaceC7289vu0 {

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @Nullable
    private C8079zf2<String> waiter;

    /* JADX INFO: renamed from: hl1$a */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorADM", f = "PushRegistratorADM.kt", l = {35}, m = "registerForPush")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends LM {
        Object L$0;
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
            return C4271hl1.this.registerForPush(this);
        }
    }

    /* JADX INFO: renamed from: hl1$b */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorADM$registerForPush$2", f = "PushRegistratorADM.kt", l = {36}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ C3027bp1<String> $registrationId;
        Object L$0;
        int label;
        final /* synthetic */ C4271hl1 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3027bp1<String> c3027bp1, C4271hl1 c4271hl1, JM<? super b> jm) {
            super(2, jm);
            this.$registrationId = c3027bp1;
            this.this$0 = c4271hl1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new b(this.$registrationId, this.this$0, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
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
                c3027bp1 = this.$registrationId;
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

    public C4271hl1(@NotNull InterfaceC2338Wr0 _applicationService) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        this._applicationService = _applicationService;
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
    /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
    @Override // defpackage.InterfaceC7079uu0
    @Nullable
    public Object registerForPush(@NotNull JM<? super InterfaceC7079uu0.a> jm) {
        a aVar;
        C3027bp1 c3027bp1;
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
        Object obj = aVar.result;
        MN mn = MN.d;
        int i2 = aVar.label;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            this.waiter = new C8079zf2<>();
            ADM adm = new ADM(this._applicationService.getAppContext());
            C3027bp1 c3027bp2 = new C3027bp1();
            ?? registrationId = adm.getRegistrationId();
            c3027bp2.d = registrationId;
            if (registrationId != 0) {
                NS0.debug$default("ADM Already registered with ID:" + ((String) c3027bp2.d), null, 2, null);
                return new InterfaceC7079uu0.a((String) c3027bp2.d, GU1.SUBSCRIBED);
            }
            adm.startRegister();
            b bVar = new b(c3027bp2, this, null);
            aVar.L$0 = c3027bp2;
            aVar.label = 1;
            if (OZ1.b(30000L, bVar, aVar) == mn) {
                return mn;
            }
            c3027bp1 = c3027bp2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3027bp1 = (C3027bp1) aVar.L$0;
            C1795Pt1.b(obj);
        }
        if (c3027bp1.d == null) {
            NS0.error$default("com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.", null, 2, null);
            return new InterfaceC7079uu0.a(null, GU1.ERROR);
        }
        NS0.error$default("ADM registered with ID:" + ((String) c3027bp1.d), null, 2, null);
        return new InterfaceC7079uu0.a((String) c3027bp1.d, GU1.SUBSCRIBED);
    }
}
