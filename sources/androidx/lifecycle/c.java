package androidx.lifecycle;

import defpackage.AW1;
import defpackage.C1795Pt1;
import defpackage.C6610sg0;
import defpackage.InterfaceC1133Hh1;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC6606sf0;
import defpackage.JM;
import defpackage.KN;
import defpackage.MN;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {91}, m = "invokeSuspend")
public final class c extends AW1 implements Function2<InterfaceC1133Hh1<Object>, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ g g;
    public final /* synthetic */ g.b h;
    public final /* synthetic */ C6610sg0 i;

    @InterfaceC3368dU(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C6610sg0 e;
        public final /* synthetic */ InterfaceC1133Hh1<Object> g;

        /* JADX INFO: renamed from: androidx.lifecycle.c$a$a, reason: collision with other inner class name */
        public static final class C0235a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC1133Hh1<T> d;

            /* JADX WARN: Multi-variable type inference failed */
            public C0235a(InterfaceC1133Hh1<? super T> interfaceC1133Hh1) {
                this.d = interfaceC1133Hh1;
            }

            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(T t, @NotNull JM<? super Unit> jm) {
                Object objJ = this.d.j(jm, t);
                return objJ == MN.d ? objJ : Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6610sg0 c6610sg0, InterfaceC1133Hh1 interfaceC1133Hh1, JM jm) {
            super(2, jm);
            this.e = c6610sg0;
            this.g = interfaceC1133Hh1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new a(this.e, this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C0235a c0235a = new C0235a(this.g);
                this.d = 1;
                if (this.e.c(c0235a, this) == mn) {
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
    public c(g gVar, g.b bVar, C6610sg0 c6610sg0, JM jm) {
        super(2, jm);
        this.g = gVar;
        this.h = bVar;
        this.i = c6610sg0;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        c cVar = new c(this.g, this.h, this.i, jm);
        cVar.e = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1133Hh1<Object> interfaceC1133Hh1, JM<? super Unit> jm) {
        return ((c) create(interfaceC1133Hh1, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC1133Hh1 interfaceC1133Hh1;
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC1133Hh1 interfaceC1133Hh2 = (InterfaceC1133Hh1) this.e;
            a aVar = new a(this.i, interfaceC1133Hh2, null);
            this.e = interfaceC1133Hh2;
            this.d = 1;
            if (RepeatOnLifecycleKt.b(this.g, this.h, aVar, this) == mn) {
                return mn;
            }
            interfaceC1133Hh1 = interfaceC1133Hh2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1133Hh1 = (InterfaceC1133Hh1) this.e;
            C1795Pt1.b(obj);
        }
        interfaceC1133Hh1.a(null);
        return Unit.a;
    }
}
