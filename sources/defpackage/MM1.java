package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class MM1 {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;
    public final c a = new c();
    public final C3020bn0<b, Bitmap> b = new C3020bn0<>();
    public final HashMap c = new HashMap();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class b implements InterfaceC0971Ff1 {
        public final c a;
        public int b;
        public Bitmap.Config c;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // defpackage.InterfaceC0971Ff1
        public final void a() {
            this.a.a(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.b == bVar.b && C6177qc2.b(this.c, bVar.c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.b * 31;
            Bitmap.Config config = this.c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return MM1.c(this.b, this.c);
        }
    }

    public static class c extends AbstractC6646sq {
        public final InterfaceC0971Ff1 b() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        d = configArr;
        e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapD = d(bitmap.getConfig());
        Integer num2 = navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(C6177qc2.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iD = C6177qc2.d(config) * i * i2;
        c cVar = this.a;
        InterfaceC0971Ff1 interfaceC0971Ff1B = (InterfaceC0971Ff1) ((ArrayDeque) cVar.b).poll();
        if (interfaceC0971Ff1B == null) {
            interfaceC0971Ff1B = cVar.b();
        }
        b bVar = (b) interfaceC0971Ff1B;
        bVar.b = iD;
        bVar.c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i3 = a.a[config.ordinal()];
            if (i3 == 1) {
                configArr = d;
            } else if (i3 == 2) {
                configArr = f;
            } else if (i3 != 3) {
                configArr = i3 != 4 ? new Bitmap.Config[]{config} : h;
            } else {
                configArr = g;
            }
        } else {
            configArr = e;
        }
        for (Bitmap.Config config2 : configArr) {
            Integer numCeilingKey = d(config2).ceilingKey(Integer.valueOf(iD));
            if (numCeilingKey != null && numCeilingKey.intValue() <= iD * 8) {
                if (numCeilingKey.intValue() == iD && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                cVar.a(bVar);
                int iIntValue = numCeilingKey.intValue();
                InterfaceC0971Ff1 interfaceC0971Ff1B2 = (InterfaceC0971Ff1) ((ArrayDeque) cVar.b).poll();
                if (interfaceC0971Ff1B2 == null) {
                    interfaceC0971Ff1B2 = cVar.b();
                }
                bVar = (b) interfaceC0971Ff1B2;
                bVar.b = iIntValue;
                bVar.c = config2;
                break;
            }
        }
        Bitmap bitmapA = this.b.a(bVar);
        if (bitmapA != null) {
            a(Integer.valueOf(bVar.b), bitmapA);
            bitmapA.reconfigure(i, i2, config);
        }
        return bitmapA;
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        HashMap map = this.c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int iC = C6177qc2.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        c cVar = this.a;
        InterfaceC0971Ff1 interfaceC0971Ff1B = (InterfaceC0971Ff1) ((ArrayDeque) cVar.b).poll();
        if (interfaceC0971Ff1B == null) {
            interfaceC0971Ff1B = cVar.b();
        }
        b bVar = (b) interfaceC0971Ff1B;
        bVar.b = iC;
        bVar.c = config;
        this.b.b(bVar, bitmap);
        NavigableMap<Integer, Integer> navigableMapD = d(bitmap.getConfig());
        Integer num = navigableMapD.get(Integer.valueOf(bVar.b));
        navigableMapD.put(Integer.valueOf(bVar.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbF = C1039Gc0.f("SizeConfigStrategy{groupedMap=");
        sbF.append(this.b);
        sbF.append(", sortedSizes=(");
        HashMap map = this.c;
        for (Map.Entry entry : map.entrySet()) {
            sbF.append(entry.getKey());
            sbF.append('[');
            sbF.append(entry.getValue());
            sbF.append("], ");
        }
        if (!map.isEmpty()) {
            sbF.replace(sbF.length() - 2, sbF.length(), "");
        }
        sbF.append(")}");
        return sbF.toString();
    }
}
