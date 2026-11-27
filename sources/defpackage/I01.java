package defpackage;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface I01<Model, Data> {

    public static class a<Data> {
        public final InterfaceC3129cK0 a;
        public final List<InterfaceC3129cK0> b;
        public final InterfaceC6771tS<Data> c;

        public a() {
            throw null;
        }

        public a(@NonNull InterfaceC3129cK0 interfaceC3129cK0, @NonNull InterfaceC6771tS<Data> interfaceC6771tS) {
            List<InterfaceC3129cK0> list = Collections.EMPTY_LIST;
            UE.e(interfaceC3129cK0, "Argument must not be null");
            this.a = interfaceC3129cK0;
            UE.e(list, "Argument must not be null");
            this.b = list;
            UE.e(interfaceC6771tS, "Argument must not be null");
            this.c = interfaceC6771tS;
        }
    }

    boolean a(@NonNull Model model);

    a<Data> b(@NonNull Model model, int i, int i2, @NonNull C4227ha1 c4227ha1);
}
