package defpackage;

import com.appsflyer.share.attribution.RequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.profileandsettings.settings.screens.SettingsViewModelBase$onOneClickDealsSwitchClick$1", f = "SettingsViewModelBase.kt", l = {RequestError.NETWORK_FAILURE}, m = "invokeSuspend")
public final class HJ1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ JJ1 e;

    @InterfaceC3368dU(c = "com.base.feature.profileandsettings.settings.screens.SettingsViewModelBase$onOneClickDealsSwitchClick$1$1", f = "SettingsViewModelBase.kt", l = {RequestError.NO_DEV_KEY}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Boolean>, Object> {
        public int d;
        public final /* synthetic */ JJ1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JJ1 jj1, JM<? super a> jm) {
            super(1, jm);
            this.e = jj1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Boolean> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC6396rf0<Boolean> interfaceC6396rf0L = this.e.f.l();
                this.d = 1;
                obj = C4466ii.o(interfaceC6396rf0L, this);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Boolean.valueOf(!((Boolean) obj).booleanValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HJ1(JJ1 jj1, JM<? super HJ1> jm) {
        super(2, jm);
        this.e = jj1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new HJ1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((HJ1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            JJ1 jj1 = this.e;
            AbstractC6505s91 abstractC6505s91 = jj1.f;
            a aVar = new a(jj1, null);
            this.d = 1;
            if (abstractC6505s91.m(aVar, this) == mn) {
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
