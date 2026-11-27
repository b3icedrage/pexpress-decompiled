package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.api.feature.webpage.screen.WebViewFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.webpage.screen.WebViewFragment$initWebChromeClientFlowCollectors$$inlined$launchAndCollectIn$3", f = "WebViewFragment.kt", l = {48}, m = "invokeSuspend")
public final class Xh2 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ C1811Pz g;
    public final /* synthetic */ WebViewFragment h;

    @InterfaceC3368dU(c = "com.api.feature.webpage.screen.WebViewFragment$initWebChromeClientFlowCollectors$$inlined$launchAndCollectIn$3$1", f = "WebViewFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C1811Pz g;
        public final /* synthetic */ WebViewFragment h;

        /* JADX INFO: renamed from: Xh2$a$a, reason: collision with other inner class name */
        public static final class C0195a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ WebViewFragment e;

            public C0195a(KN kn, WebViewFragment webViewFragment) {
                this.e = webViewFragment;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                Object obj2 = this.e.i;
                Intrinsics.checkNotNull(obj2);
                AbstractC4260hi2 abstractC4260hi2 = (AbstractC4260hi2) obj2;
                abstractC4260hi2.getClass();
                C5189lv.k(C8056za.j(abstractC4260hi2), null, new C4050gi2(abstractC4260hi2, null), 3);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1811Pz c1811Pz, JM jm, WebViewFragment webViewFragment) {
            super(2, jm);
            this.g = c1811Pz;
            this.h = webViewFragment;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.g, jm, this.h);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C0195a c0195a = new C0195a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0195a, this) == mn) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xh2(FP0 fp0, C1811Pz c1811Pz, JM jm, WebViewFragment webViewFragment) {
        super(2, jm);
        this.e = fp0;
        this.g = c1811Pz;
        this.h = webViewFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new Xh2(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((Xh2) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h);
            this.d = 1;
            if (RepeatOnLifecycleKt.a(this.e, g.b.g, aVar, this) == mn) {
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
