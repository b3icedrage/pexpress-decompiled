package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: nF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5473nF {
    public Object a;
    public final Object b;

    public C5473nF() {
        this.b = new ArrayList();
    }

    public void a(@NotNull C4701jc navigator) {
        Intrinsics.d(navigator, "navigator");
        this.a = navigator;
        ArrayList arrayList = (ArrayList) this.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            navigator.d((InterfaceC5263mF[]) it.next());
        }
        arrayList.clear();
    }

    public C5473nF(ArrayList arrayList, Map map) {
        this.b = arrayList;
        this.a = map;
    }

    public C5473nF(@NonNull ArrayList arrayList, @NonNull ArrayList arrayList2) {
        int size = arrayList.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.a)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.b)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C5473nF(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{0.0f, 1.0f};
    }

    public C5473nF(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{0.0f, 0.5f, 1.0f};
    }
}
