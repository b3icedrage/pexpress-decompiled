package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Tf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2064Tf0<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ InterfaceC6606sf0<T> d;

    /* JADX INFO: renamed from: Tf0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", l = {79}, m = "emit")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public final /* synthetic */ C2064Tf0<T> e;
        public int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C2064Tf0<? super T> c2064Tf0, JM<? super a> jm) {
            super(jm);
            this.e = c2064Tf0;
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
    public C2064Tf0(InterfaceC6606sf0<? super T> interfaceC6606sf0) {
        this.d = interfaceC6606sf0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC6606sf0
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object a(@NotNull InterfaceC6396rf0<? extends T> interfaceC6396rf0, @NotNull JM<? super Unit> jm) {
        a aVar;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.g = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, jm);
            }
        } else {
            aVar = new a(this, jm);
        }
        Object obj = aVar.d;
        MN mn = MN.d;
        int i2 = aVar.g;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            aVar.g = 1;
            if (C4466ii.n(aVar, interfaceC6396rf0, this.d) == mn) {
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
