package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6670sy<T> implements InterfaceC6460ry<T> {

    @NotNull
    public final C3098cA d;

    /* JADX INFO: renamed from: sy$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0<T> d;

        /* JADX INFO: renamed from: sy$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", l = {271}, m = "emit")
        public static final class C0490a extends LM {
            public /* synthetic */ Object d;
            public final /* synthetic */ a<T> e;
            public int g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0490a(a<? super T> aVar, JM<? super C0490a> jm) {
                super(jm);
                this.e = aVar;
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.d = obj;
                this.g |= Integer.MIN_VALUE;
                return this.e.a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC6606sf0<? super T> interfaceC6606sf0) {
            this.d = interfaceC6606sf0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.InterfaceC6606sf0
        @Nullable
        public final Object a(T t, @NotNull JM<? super Unit> jm) {
            C0490a c0490a;
            if (jm instanceof C0490a) {
                c0490a = (C0490a) jm;
                int i = c0490a.g;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0490a.g = i - Integer.MIN_VALUE;
                } else {
                    c0490a = new C0490a(this, jm);
                }
            } else {
                c0490a = new C0490a(this, jm);
            }
            Object obj = c0490a.d;
            MN mn = MN.d;
            int i2 = c0490a.g;
            if (i2 == 0) {
                C1795Pt1.b(obj);
                ED.h(c0490a.getContext());
                c0490a.g = 1;
                if (this.d.a(t, c0490a) == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    public C6670sy(@NotNull C3098cA c3098cA) {
        this.d = c3098cA;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super T> interfaceC6606sf0, @NotNull JM<? super Unit> jm) {
        Object objC = this.d.c(new a(interfaceC6606sf0), jm);
        return objC == MN.d ? objC : Unit.a;
    }
}
