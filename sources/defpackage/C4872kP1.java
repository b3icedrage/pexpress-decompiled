package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4872kP1 extends AbstractC7124v62 {
    public final /* synthetic */ ArrayList c;

    public C4872kP1(ArrayList arrayList) {
        this.c = arrayList;
    }

    @Override // defpackage.AbstractC7124v62
    public final N62 h(InterfaceC6494s62 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.c.contains(key)) {
            return null;
        }
        InterfaceC5044lD interfaceC5044lDC = key.c();
        Intrinsics.c(interfaceC5044lDC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        return C3089c72.k((H62) interfaceC5044lDC);
    }
}
