package defpackage;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: pR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5930pR0<Data, ResourceType, Transcode> {
    public final C5751ob0.c a;
    public final List<? extends C6987uU<Data, ResourceType, Transcode>> b;
    public final String c;

    public C5930pR0(Class cls, Class cls2, Class cls3, List list, C5751ob0.c cVar) {
        this.a = cVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final InterfaceC3667et1 a(int i, int i2, RunnableC6777tU.a aVar, @NonNull C4227ha1 c4227ha1, a aVar2) {
        C5751ob0.c cVar = this.a;
        List list = (List) cVar.a();
        try {
            List<? extends C6987uU<Data, ResourceType, Transcode>> list2 = this.b;
            int size = list2.size();
            InterfaceC3667et1 interfaceC3667et1A = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    interfaceC3667et1A = list2.get(i3).a(i, i2, aVar, c4227ha1, aVar2);
                } catch (C2160Ul0 e) {
                    list.add(e);
                }
                if (interfaceC3667et1A != null) {
                    break;
                }
            }
            if (interfaceC3667et1A != null) {
                cVar.b(list);
                return interfaceC3667et1A;
            }
            throw new C2160Ul0(this.c, new ArrayList(list));
        } catch (Throwable th) {
            cVar.b(list);
            throw th;
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
