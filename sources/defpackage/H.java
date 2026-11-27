package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class H {
    public final /* synthetic */ I<Object, Object> a;
    public final /* synthetic */ HashMap<TY0, List<Object>> b;
    public final /* synthetic */ InterfaceC2699aL0 c;

    public final class a extends b {
        public final /* synthetic */ H d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(H h, TY0 signature) {
            super(h, signature);
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.d = h;
        }

        public final C4970ks c(int i, QC classId, C4285hp1 source) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            Intrinsics.checkNotNullParameter(source, "source");
            TY0 signature = this.a;
            Intrinsics.checkNotNullParameter(signature, "signature");
            TY0 ty0 = new TY0(signature.a + '@' + i);
            H h = this.d;
            List<Object> arrayList = h.b.get(ty0);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                h.b.put(ty0, arrayList);
            }
            return h.a.q(classId, source, arrayList);
        }
    }

    public class b implements InterfaceC2699aL0.c {
        public final TY0 a;
        public final ArrayList<Object> b;
        public final /* synthetic */ H c;

        public b(H h, TY0 signature) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.c = h;
            this.a = signature;
            this.b = new ArrayList<>();
        }

        @Override // defpackage.InterfaceC2699aL0.c
        public final void a() {
            ArrayList<Object> arrayList = this.b;
            if (arrayList.isEmpty()) {
                return;
            }
            this.c.b.put(this.a, arrayList);
        }

        @Override // defpackage.InterfaceC2699aL0.c
        public final InterfaceC2699aL0.a b(QC classId, C4285hp1 source) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            Intrinsics.checkNotNullParameter(source, "source");
            return this.c.a.q(classId, source, this.b);
        }
    }

    public H(I i, HashMap map, InterfaceC2699aL0 interfaceC2699aL0, HashMap map2) {
        this.a = i;
        this.b = map;
        this.c = interfaceC2699aL0;
    }

    public final a a(C5638o21 name, String desc) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        String name2 = name.e();
        Intrinsics.checkNotNullExpressionValue(name2, "asString(...)");
        Intrinsics.checkNotNullParameter(name2, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        return new a(this, new TY0(Z0.c(name2, desc)));
    }
}
