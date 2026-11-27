package defpackage;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: iX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4427iX0 {
    public final Map<Class<? extends AbstractC6909u51>, InterfaceC3771fO1> a;

    /* JADX INFO: renamed from: iX0$a */
    public static class a {
        public final HashMap a = new HashMap(3);

        @NonNull
        public final a a(@NonNull Class cls, InterfaceC3771fO1 interfaceC3771fO1) {
            this.a.put(cls, interfaceC3771fO1);
            return this;
        }
    }

    public C4427iX0(@NonNull Map<Class<? extends AbstractC6909u51>, InterfaceC3771fO1> map) {
        this.a = map;
    }
}
