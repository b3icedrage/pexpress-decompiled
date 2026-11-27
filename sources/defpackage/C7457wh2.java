package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7457wh2<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ InterfaceC6606sf0 d;

    /* JADX INFO: renamed from: wh2$a */
    @InterfaceC3368dU(c = "com.impl.core.backend.providers.WebSocketUrlProvider$special$$inlined$map$2$2", f = "WebSocketUrlProvider.kt", l = {219}, m = "emit")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int e;

        public a(JM jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return C7457wh2.this.a(null, this);
        }
    }

    public C7457wh2(InterfaceC6606sf0 interfaceC6606sf0) {
        this.d = interfaceC6606sf0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.InterfaceC6606sf0
    @Nullable
    public final Object a(Object obj, @NotNull JM jm) {
        a aVar;
        ArrayList arrayList;
        ?? r8;
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
        Object obj2 = aVar.d;
        MN mn = MN.d;
        int i2 = aVar.e;
        if (i2 == 0) {
            C1795Pt1.b(obj2);
            FF ff = (FF) obj;
            if (ff == null || (r8 = ff.q) == 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Object obj3 : r8) {
                    if (StringsKt.C(((C5686oG) obj3).a, "demo", false)) {
                        arrayList.add(obj3);
                    }
                }
            }
            aVar.e = 1;
            if (this.d.a(arrayList, aVar) == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj2);
        }
        return Unit.a;
    }
}
