package defpackage;

import kotlin.Unit;
import kotlin.collections.IndexedValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5351mg0<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ InterfaceC6606sf0<IndexedValue<? extends T>> d;
    public final /* synthetic */ C2590Zo1 e;

    /* JADX INFO: renamed from: mg0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", l = {67}, m = "emit")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public final /* synthetic */ C5351mg0<T> e;
        public int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C5351mg0<? super T> c5351mg0, JM<? super a> jm) {
            super(jm);
            this.e = c5351mg0;
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
    public C5351mg0(InterfaceC6606sf0<? super IndexedValue<? extends T>> interfaceC6606sf0, C2590Zo1 c2590Zo1) {
        this.d = interfaceC6606sf0;
        this.e = c2590Zo1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC6606sf0
    @Nullable
    public final Object a(T t, @NotNull JM<? super Unit> jm) {
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
            C2590Zo1 c2590Zo1 = this.e;
            int i3 = c2590Zo1.d;
            c2590Zo1.d = i3 + 1;
            if (i3 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            IndexedValue<? extends T> indexedValue = new IndexedValue<>(i3, t);
            aVar.g = 1;
            if (this.d.a(indexedValue, aVar) == mn) {
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
