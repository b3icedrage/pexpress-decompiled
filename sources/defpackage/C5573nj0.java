package defpackage;

import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import androidx.recyclerview.widget.RecyclerView;
import com.base.feature.stories.screens.full.FullStoriesFragmentBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.stories.screens.full.FullStoriesFragmentBase$setupListeners$lambda$6$$inlined$launchAndCollectIn$default$4", f = "FullStoriesFragmentBase.kt", l = {48}, m = "invokeSuspend")
public final class C5573nj0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ FullStoriesFragmentBase h;
    public final /* synthetic */ C5783oj0 i;

    /* JADX INFO: renamed from: nj0$a */
    @InterfaceC3368dU(c = "com.base.feature.stories.screens.full.FullStoriesFragmentBase$setupListeners$lambda$6$$inlined$launchAndCollectIn$default$4$1", f = "FullStoriesFragmentBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ FullStoriesFragmentBase h;
        public final /* synthetic */ C5783oj0 i;

        /* JADX INFO: renamed from: nj0$a$a, reason: collision with other inner class name */
        public static final class C0449a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ FullStoriesFragmentBase e;
            public final /* synthetic */ C5783oj0 g;

            public C0449a(KN kn, FullStoriesFragmentBase fullStoriesFragmentBase, C5783oj0 c5783oj0) {
                this.e = fullStoriesFragmentBase;
                this.g = c5783oj0;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                int max;
                float fFloatValue = ((Number) obj).floatValue();
                FullStoriesFragmentBase fullStoriesFragmentBase = this.e;
                YQ holder = FullStoriesFragmentBase.l(fullStoriesFragmentBase);
                if (holder != null) {
                    RecyclerView.e adapter = fullStoriesFragmentBase.k().e.getAdapter();
                    if ((adapter instanceof TQ1 ? (TQ1) adapter : null) != null) {
                        int iIntValue = this.g.i.getValue().intValue();
                        Intrinsics.checkNotNullParameter(holder, "holder");
                        LinearLayout progressList = holder.u.i;
                        Intrinsics.checkNotNullExpressionValue(progressList, "progressList");
                        C7439wd0.a aVar = new C7439wd0.a(JH1.h(new Id2(progressList), LI.g));
                        int i = 0;
                        while (aVar.hasNext()) {
                            Object next = aVar.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                WE.l();
                                throw null;
                            }
                            ProgressBar progressBar = (ProgressBar) next;
                            if (i < iIntValue) {
                                max = progressBar.getMax();
                            } else {
                                max = i == iIntValue ? (int) (progressBar.getMax() * fFloatValue) : 0;
                            }
                            progressBar.setProgress(max);
                            i = i2;
                        }
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, FullStoriesFragmentBase fullStoriesFragmentBase, C5783oj0 c5783oj0) {
            super(2, jm);
            this.g = interfaceC6396rf0;
            this.h = fullStoriesFragmentBase;
            this.i = c5783oj0;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.g, jm, this.h, this.i);
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
                C0449a c0449a = new C0449a((KN) this.e, this.h, this.i);
                this.d = 1;
                if (this.g.c(c0449a, this) == mn) {
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
    public C5573nj0(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, FullStoriesFragmentBase fullStoriesFragmentBase, C5783oj0 c5783oj0) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC6396rf0;
        this.h = fullStoriesFragmentBase;
        this.i = c5783oj0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5573nj0(this.e, this.g, jm, this.h, this.i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5573nj0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h, this.i);
            this.d = 1;
            if (RepeatOnLifecycleKt.a(this.e, g.b.h, aVar, this) == mn) {
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
