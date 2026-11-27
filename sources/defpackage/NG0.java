package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class NG0 {

    @NotNull
    public final C5016l50 a;
    public boolean b;

    public /* synthetic */ class a extends C2784ak0 implements Function2<MH1, Integer, Boolean> {
        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(MH1 mh1, Integer num) {
            MH1 p0 = mh1;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            NG0 ng0 = (NG0) this.e;
            ng0.getClass();
            boolean z = !p0.j(iIntValue) && p0.i(iIntValue).c();
            ng0.b = z;
            return Boolean.valueOf(z);
        }
    }

    public NG0(@NotNull MH1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.a = new C5016l50(descriptor, new a(2, this, NG0.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0));
    }
}
