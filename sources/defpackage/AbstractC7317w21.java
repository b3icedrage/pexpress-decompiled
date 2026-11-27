package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: w21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7317w21 extends AbstractC5106lX1<String> {
    @NotNull
    public String S(@NotNull MH1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return descriptor.f(i);
    }

    @Override // defpackage.AbstractC5106lX1
    @NotNull
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final String Q(@NotNull MH1 mh1, int i) {
        Intrinsics.checkNotNullParameter(mh1, "<this>");
        String childName = S(mh1, i);
        Intrinsics.checkNotNullParameter(childName, "nestedName");
        String parentName = (String) CollectionsKt.N(this.a);
        if (parentName == null) {
            parentName = "";
        }
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }
}
