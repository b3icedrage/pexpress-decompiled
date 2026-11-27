package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class PV1 extends C7576xG {

    @NotNull
    public final InterfaceC4890kV1 d;

    @NotNull
    public final IV1 e;

    @NotNull
    public final WA f;

    @NotNull
    public final InterfaceC0565Aa0 g;

    @NotNull
    public final AbstractC2903bE1 h;

    @NotNull
    public final GP1 i;

    @NotNull
    public final C1699On1 j;

    @NotNull
    public final C6610sg0 k;

    @NotNull
    public final C6610sg0 l;

    @InterfaceC3368dU(c = "com.base.feature.support.support.screens.need_help.SupportNeedHelpViewModelBase$1", f = "SupportNeedHelpViewModelBase.kt", l = {43}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return PV1.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            PV1 pv1 = PV1.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC0565Aa0 interfaceC0565Aa0 = pv1.g;
                this.d = 1;
                obj = JK0.a(interfaceC0565Aa0, this);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            if (obj != HK0.CONTROL_GROUP) {
                GP1 gp1 = pv1.i;
                Boolean bool = Boolean.TRUE;
                gp1.getClass();
                gp1.m(null, bool);
            }
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.support.support.screens.need_help.SupportNeedHelpViewModelBase$greenChatIndicatorState$1", f = "SupportNeedHelpViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class b extends AW1 implements InterfaceC1060Gj0<Boolean, Boolean, JM<? super Boolean>, Object> {
        public /* synthetic */ boolean d;
        public /* synthetic */ boolean e;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.valueOf(this.d && !this.e);
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(Boolean bool, Boolean bool2, JM<? super Boolean> jm) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            b bVar = new b(3, jm);
            bVar.d = zBooleanValue;
            bVar.e = zBooleanValue2;
            return bVar.invokeSuspend(Unit.a);
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.support.support.screens.need_help.SupportNeedHelpViewModelBase$indicatorVisibility$1", f = "SupportNeedHelpViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class c extends AW1 implements InterfaceC1060Gj0<Boolean, Boolean, JM<? super Boolean>, Object> {
        public /* synthetic */ boolean d;
        public /* synthetic */ boolean e;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.valueOf(this.d && this.e);
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(Boolean bool, Boolean bool2, JM<? super Boolean> jm) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            c cVar = new c(3, jm);
            cVar.d = zBooleanValue;
            cVar.e = zBooleanValue2;
            return cVar.invokeSuspend(Unit.a);
        }
    }

    public PV1(@NotNull InterfaceC4890kV1 supportCallbacks, @NotNull IV1 supportMessagesDataMapManager, @NotNull WA chatInitializer, @NotNull InterfaceC0565Aa0 experimentsProviderApi, @NotNull AbstractC2903bE1 screenToChatTransitionProvider) {
        Intrinsics.checkNotNullParameter(supportCallbacks, "supportCallbacks");
        Intrinsics.checkNotNullParameter(supportMessagesDataMapManager, "supportMessagesDataMapManager");
        Intrinsics.checkNotNullParameter(chatInitializer, "chatInitializer");
        Intrinsics.checkNotNullParameter(experimentsProviderApi, "experimentsProviderApi");
        Intrinsics.checkNotNullParameter(screenToChatTransitionProvider, "screenToChatTransitionProvider");
        this.d = supportCallbacks;
        this.e = supportMessagesDataMapManager;
        this.f = chatInitializer;
        this.g = experimentsProviderApi;
        this.h = screenToChatTransitionProvider;
        GP1 gp1I = C1589Ne.i(Boolean.FALSE);
        this.i = gp1I;
        C1699On1 c1699On1F = C4466ii.f(gp1I);
        this.j = c1699On1F;
        this.k = new C6610sg0(supportMessagesDataMapManager.b(), c1699On1F, new b(3, null));
        this.l = new C6610sg0(supportMessagesDataMapManager.b(), c1699On1F, new c(3, null));
        C5189lv.k(C8056za.j(this), null, new a(null), 3);
    }
}
