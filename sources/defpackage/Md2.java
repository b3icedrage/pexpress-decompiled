package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.android.internal.ViewHierarchyScanner$findTarget$1", f = "ViewHierarchyScanner.kt", l = {47}, m = "invokeSuspend")
public final class Md2 extends AW1 implements Function2<KN, JM<? super C6814te2>, Object> {
    public int d;
    public final /* synthetic */ View e;
    public final /* synthetic */ DS0 g;
    public final /* synthetic */ Pair<Float, Float> h;
    public final /* synthetic */ List<InterfaceC7445we2> i;

    @InterfaceC3368dU(c = "com.amplitude.android.internal.ViewHierarchyScanner$findTarget$1$1", f = "ViewHierarchyScanner.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super C6814te2>, Object> {
        public final /* synthetic */ View d;
        public final /* synthetic */ Pair<Float, Float> e;
        public final /* synthetic */ List<InterfaceC7445we2> g;
        public final /* synthetic */ DS0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JM jm, DS0 ds0, View view, List list, Pair pair) {
            super(2, jm);
            this.d = view;
            this.e = pair;
            this.g = list;
            this.h = ds0;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            View view = this.d;
            Pair<Float, Float> pair = this.e;
            return new a(jm, this.h, view, this.g, pair);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super C6814te2> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Nd2.a(this.d, this.e, this.g, this.h);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Md2(JM jm, DS0 ds0, View view, List list, Pair pair) {
        super(2, jm);
        this.e = view;
        this.g = ds0;
        this.h = pair;
        this.i = list;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        return new Md2(jm, this.g, this.e, this.i, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super C6814te2> jm) {
        return ((Md2) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Looper mainLooper;
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            View view = this.e;
            Handler handler = view.getHandler();
            DS0 ds0 = this.g;
            if ((handler == null || (mainLooper = handler.getLooper()) == null) && (mainLooper = Looper.getMainLooper()) == null) {
                ds0.error("Unable to get main looper");
                return null;
            }
            boolean zA = Intrinsics.a(mainLooper.getThread(), Thread.currentThread());
            Pair<Float, Float> pair = this.h;
            if (zA) {
                return Nd2.a(view, pair, this.i, ds0);
            }
            RV rv = C6266r20.a;
            AbstractC8109zn0 abstractC8109zn0 = QV0.a;
            a aVar = new a(null, this.g, view, this.i, pair);
            this.d = 1;
            obj = C5189lv.p(abstractC8109zn0, aVar, this);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return (C6814te2) obj;
    }
}
