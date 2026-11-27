package defpackage;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: rO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6340rO0 implements InterfaceC3232co0 {
    public final Map<String, List<InterfaceC6131qO0>> b;
    public volatile Map<String, String> c;

    /* JADX INFO: renamed from: rO0$a */
    public static final class a {
        public static final Map<String, List<InterfaceC6131qO0>> a;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char cCharAt = property.charAt(i);
                    if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                        sb.append(cCharAt);
                    } else {
                        sb.append('?');
                    }
                }
                property = sb.toString();
            }
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                map.put("User-Agent", Collections.singletonList(new b(property)));
            }
            a = Collections.unmodifiableMap(map);
        }
    }

    /* JADX INFO: renamed from: rO0$b */
    public static final class b implements InterfaceC6131qO0 {

        @NonNull
        public final String a;

        public b(@NonNull String str) {
            this.a = str;
        }

        @Override // defpackage.InterfaceC6131qO0
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return C5807oq.b(new StringBuilder("StringHeaderFactory{value='"), this.a, "'}");
        }
    }

    public C6340rO0(Map<String, List<InterfaceC6131qO0>> map) {
        this.b = Collections.unmodifiableMap(map);
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<InterfaceC6131qO0>> entry : this.b.entrySet()) {
            List<InterfaceC6131qO0> value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = value.size();
            for (int i = 0; i < size; i++) {
                String strA = value.get(i).a();
                if (!TextUtils.isEmpty(strA)) {
                    sb.append(strA);
                    if (i != value.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final Map<String, String> b() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.c = Collections.unmodifiableMap(a());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6340rO0) {
            return this.b.equals(((C6340rO0) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.b + '}';
    }
}
