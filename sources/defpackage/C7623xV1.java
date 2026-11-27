package defpackage;

import android.view.ViewGroup;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.support.support.screens.common.SupportFragment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: xV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.support.screens.common.SupportFragment$initFlowCollectors$$inlined$launchAndCollectIn$1", f = "SupportFragment.kt", l = {48}, m = "invokeSuspend")
public final class C7623xV1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ SupportFragment h;

    /* JADX INFO: renamed from: xV1$a */
    @InterfaceC3368dU(c = "com.base.feature.support.support.screens.common.SupportFragment$initFlowCollectors$$inlined$launchAndCollectIn$1$1", f = "SupportFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ SupportFragment h;

        /* JADX INFO: renamed from: xV1$a$a, reason: collision with other inner class name */
        public static final class C0534a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ SupportFragment e;

            public C0534a(KN kn, SupportFragment supportFragment) {
                this.e = supportFragment;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                List list = (List) obj;
                Set<Map.Entry> setEntrySet = SupportFragment.n(this.e.k()).entrySet();
                int iA = OW0.a(XE.m(setEntrySet, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (Map.Entry entry : setEntrySet) {
                    linkedHashMap.put((QV1) entry.getValue(), (ViewGroup) entry.getKey());
                }
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ViewGroup viewGroup = (ViewGroup) linkedHashMap.get((QV1) it.next());
                    if (viewGroup != null) {
                        viewGroup.setVisibility(8);
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FP1 fp1, JM jm, SupportFragment supportFragment) {
            super(2, jm);
            this.g = fp1;
            this.h = supportFragment;
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
                C0534a c0534a = new C0534a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0534a, this) == mn) {
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
    public C7623xV1(FP0 fp0, FP1 fp1, JM jm, SupportFragment supportFragment) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = supportFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7623xV1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7623xV1) create(kn, jm)).invokeSuspend(Unit.a);
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
