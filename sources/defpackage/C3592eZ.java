package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: eZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3592eZ extends AbstractC3302d81<Object> {
    public final /* synthetic */ C3802fZ b;

    /* JADX WARN: Multi-variable type inference failed */
    public C3592eZ(Object obj, C3802fZ c3802fZ) {
        this.b = c3802fZ;
        this.a = obj;
    }

    @Override // defpackage.AbstractC3302d81
    public final void a(IJ0 property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (this.b.a) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
    }
}
