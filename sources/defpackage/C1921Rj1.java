package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Rj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1921Rj1 implements CC {

    @NotNull
    public final C6058q21 a;

    @NotNull
    public final C7081uv b;

    @NotNull
    public final XZ c;

    @NotNull
    public final LinkedHashMap d;

    public C1921Rj1(@NotNull C3428dk1 proto, @NotNull C6058q21 nameResolver, @NotNull C7081uv metadataVersion, @NotNull XZ classSource) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(classSource, "classSource");
        this.a = nameResolver;
        this.b = metadataVersion;
        this.c = classSource;
        List<C2077Tj1> list = proto.k;
        Intrinsics.checkNotNullExpressionValue(list, "getClass_List(...)");
        int iA = OW0.a(XE.m(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (Object obj : list) {
            linkedHashMap.put(C6267r21.a(this.a, ((C2077Tj1) obj).i), obj);
        }
        this.d = linkedHashMap;
    }

    @Override // defpackage.CC
    @Nullable
    public final BC a(@NotNull QC classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        C2077Tj1 c2077Tj1 = (C2077Tj1) this.d.get(classId);
        if (c2077Tj1 == null) {
            return null;
        }
        return new BC(this.a, c2077Tj1, this.b, (VN1) this.c.invoke(classId));
    }
}
