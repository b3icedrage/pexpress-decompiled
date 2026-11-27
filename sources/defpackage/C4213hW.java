package defpackage;

import android.view.View;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4213hW extends ML0 implements Function1<Map.Entry<String, View>, Boolean> {
    public final /* synthetic */ Collection<String> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4213hW(Collection<String> collection) {
        super(1);
        this.d = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Map.Entry<String, View> entry) {
        Map.Entry<String, View> entry2 = entry;
        Intrinsics.checkNotNullParameter(entry2, "entry");
        Collection<String> collection = this.d;
        View value = entry2.getValue();
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        return Boolean.valueOf(CollectionsKt.z(collection, Cd2.d.k(value)));
    }
}
