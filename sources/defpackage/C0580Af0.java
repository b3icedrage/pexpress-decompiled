package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Af0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0580Af0 implements InterfaceC6396rf0<Object> {
    public final /* synthetic */ List d;

    /* JADX INFO: renamed from: Af0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", f = "Builders.kt", l = {114}, m = "collect")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int e;
        public InterfaceC6606sf0 h;
        public Iterator i;

        public a(JM jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return C0580Af0.this.c(null, this);
        }
    }

    public C0580Af0(List list) {
        this.d = list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super Object> interfaceC6606sf0, @NotNull JM<? super Unit> jm) {
        a aVar;
        InterfaceC6606sf0 interfaceC6606sf1;
        Iterator it;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        Object obj = aVar.d;
        MN mn = MN.d;
        int i2 = aVar.e;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            interfaceC6606sf1 = interfaceC6606sf0;
            it = this.d.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = aVar.i;
            InterfaceC6606sf0 interfaceC6606sf2 = aVar.h;
            C1795Pt1.b(obj);
            interfaceC6606sf1 = interfaceC6606sf2;
        }
        while (it.hasNext()) {
            Object next = it.next();
            aVar.h = interfaceC6606sf1;
            aVar.i = it;
            aVar.e = 1;
            if (interfaceC6606sf1.a(next, aVar) == mn) {
                return mn;
            }
        }
        return Unit.a;
    }
}
