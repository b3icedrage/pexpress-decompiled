package defpackage;

import androidx.annotation.NonNull;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class DG0 implements F60<DG0> {
    public static final AG0 e = new AG0();
    public static final BG0 f = new BG0();
    public static final CG0 g = new CG0();
    public static final a h = new a();
    public final HashMap a;
    public final HashMap b;
    public final AG0 c;
    public boolean d;

    public static final class a implements Tc2<Date> {
        public static final SimpleDateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        @Override // defpackage.C60
        public final void a(@NonNull Object obj, @NonNull Uc2 uc2) {
            uc2.b(a.format((Date) obj));
        }
    }

    public DG0() {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    @NonNull
    public final F60 a(@NonNull Class cls, @NonNull K71 k71) {
        this.a.put(cls, k71);
        this.b.remove(cls);
        return this;
    }
}
