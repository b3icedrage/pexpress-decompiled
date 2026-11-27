package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ii0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1213Ii0 {

    @Nullable
    public static final C1291Ji0 a = new C1291Ji0();

    @Nullable
    public static final AbstractC1605Ni0 b;

    static {
        AbstractC1605Ni0 abstractC1605Ni0;
        try {
            abstractC1605Ni0 = (AbstractC1605Ni0) C1683Oi0.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC1605Ni0 = null;
        }
        b = abstractC1605Ni0;
    }

    public static final void a(@NotNull Fragment inFragment, @NotNull Fragment outFragment, boolean z, @NotNull C8092zj sharedElements) {
        Intrinsics.checkNotNullParameter(inFragment, "inFragment");
        Intrinsics.checkNotNullParameter(outFragment, "outFragment");
        Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
        if ((z ? outFragment.getEnterTransitionCallback() : inFragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList(sharedElements.g);
            Iterator it = ((AbstractC6155qW0.b) sharedElements.entrySet()).iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(sharedElements.g);
            Iterator it2 = ((AbstractC6155qW0.b) sharedElements.entrySet()).iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
        }
    }

    @Nullable
    public static final String b(@NotNull C8092zj<String, String> c8092zj, @NotNull String value) {
        Intrinsics.checkNotNullParameter(c8092zj, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : (AbstractC6155qW0.b) c8092zj.entrySet()) {
            if (Intrinsics.a(entry.getValue(), value)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) CollectionsKt.firstOrNull(arrayList);
    }

    public static final void c(int i, @NotNull ArrayList views) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
