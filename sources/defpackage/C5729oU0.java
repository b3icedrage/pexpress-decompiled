package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import defpackage.C3024bo1.a;
import io.sentry.instrumentation.file.j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: oU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5729oU0 {
    public static final HashMap a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final byte[] c = {80, 75, 3, 4};

    public static KU0<C3788fU0> a(final String str, Callable<JU0<C3788fU0>> callable) {
        C3788fU0 c3788fU0 = str == null ? null : C3998gU0.b.a.get(str);
        if (c3788fU0 != null) {
            return new KU0<>(new CallableC4886kU0(c3788fU0, 0), false);
        }
        HashMap map = a;
        if (str != null && map.containsKey(str)) {
            return (KU0) map.get(str);
        }
        KU0<C3788fU0> ku0 = new KU0<>(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ku0.b(new GU0() { // from class: lU0
                @Override // defpackage.GU0
                public final void a(Object obj) {
                    HashMap map2 = C5729oU0.a;
                    map2.remove(str);
                    atomicBoolean.set(true);
                    if (map2.size() == 0) {
                        C5729oU0.h(true);
                    }
                }
            });
            ku0.a(new GU0() { // from class: mU0
                @Override // defpackage.GU0
                public final void a(Object obj) {
                    HashMap map2 = C5729oU0.a;
                    map2.remove(str);
                    atomicBoolean.set(true);
                    if (map2.size() == 0) {
                        C5729oU0.h(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, ku0);
                if (map.size() == 1) {
                    h(false);
                }
            }
        }
        return ku0;
    }

    public static JU0<C3788fU0> b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return c(context.getAssets().open(str), str2);
            }
            return f(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new JU0<>((Throwable) e);
        }
    }

    public static JU0<C3788fU0> c(InputStream inputStream, String str) {
        try {
            C3024bo1 c3024bo1E = Cm2.e(Cm2.q(inputStream));
            String[] strArr = AbstractC7580xH0.i;
            return d(new TH0(c3024bo1E), str, true);
        } finally {
            C7857yc2.b(inputStream);
        }
    }

    public static JU0 d(TH0 th0, String str, boolean z) {
        try {
            C3788fU0 c3788fU0A = C5939pU0.a(th0);
            if (str != null) {
                C3998gU0.b.a.put(str, c3788fU0A);
            }
            return new JU0(c3788fU0A);
        } catch (Exception e) {
            return new JU0((Throwable) e);
        } finally {
            if (z) {
                C7857yc2.b(th0);
            }
        }
    }

    public static JU0<C3788fU0> e(Context context, int i, String str) {
        Boolean bool;
        try {
            C3024bo1 c3024bo1E = Cm2.e(Cm2.q(context.getResources().openRawResource(i)));
            try {
                C3024bo1 c3024bo1Peek = c3024bo1E.peek();
                byte[] bArr = c;
                int length = bArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        c3024bo1Peek.close();
                        bool = Boolean.TRUE;
                        break;
                    }
                    if (c3024bo1Peek.g() != bArr[i2]) {
                        bool = Boolean.FALSE;
                        break;
                    }
                    i2++;
                }
            } catch (Exception unused) {
                CS0.a.getClass();
                bool = Boolean.FALSE;
            } catch (NoSuchMethodError unused2) {
                bool = Boolean.FALSE;
            }
            return bool.booleanValue() ? f(context, new ZipInputStream(c3024bo1E.new a()), str) : c(c3024bo1E.new a(), str);
        } catch (Resources.NotFoundException e) {
            return new JU0<>((Throwable) e);
        }
    }

    public static JU0<C3788fU0> f(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return g(context, zipInputStream, str);
        } finally {
            C7857yc2.b(zipInputStream);
        }
    }

    public static JU0<C3788fU0> g(Context context, ZipInputStream zipInputStream, String str) {
        FU0 fu0;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C3788fU0 c3788fU0 = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    C3024bo1 c3024bo1E = Cm2.e(Cm2.q(zipInputStream));
                    String[] strArr = AbstractC7580xH0.i;
                    c3788fU0 = (C3788fU0) d(new TH0(c3024bo1E), null, false).a;
                } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                    String[] strArrSplit = name.split("/");
                    map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else if (name.contains(".ttf") || name.contains(".otf")) {
                    String[] strArrSplit2 = name.split("/");
                    String str2 = strArrSplit2[strArrSplit2.length - 1];
                    String str3 = str2.split("\\.")[0];
                    File file = new File(context.getCacheDir(), str2);
                    j.a.b(new FileOutputStream(file), file);
                    try {
                        FileOutputStream fileOutputStreamB = j.a.b(new FileOutputStream(file), file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStreamB.write(bArr, 0, i);
                            }
                            fileOutputStreamB.flush();
                            fileOutputStreamB.close();
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                CS0.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                            }
                            map2.put(str3, typefaceCreateFromFile);
                        } catch (Throwable th) {
                            try {
                                fileOutputStreamB.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        CS0.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                    }
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (c3788fU0 == null) {
                return new JU0<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                String str4 = (String) entry.getKey();
                Iterator it = c3788fU0.d.values().iterator();
                do {
                    if (!it.hasNext()) {
                        fu0 = null;
                        break;
                    }
                    fu0 = (FU0) it.next();
                } while (!fu0.c.equals(str4));
                if (fu0 != null) {
                    Bitmap bitmap = (Bitmap) entry.getValue();
                    C7857yc2.a aVar = C7857yc2.a;
                    int width = bitmap.getWidth();
                    int i2 = fu0.a;
                    int i3 = fu0.b;
                    if (width != i2 || bitmap.getHeight() != i3) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i3, true);
                        bitmap.recycle();
                        bitmap = bitmapCreateScaledBitmap;
                    }
                    fu0.d = bitmap;
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean z = false;
                for (C1833Qg0 c1833Qg0 : c3788fU0.e.values()) {
                    if (c1833Qg0.a.equals(entry2.getKey())) {
                        c1833Qg0.d = (Typeface) entry2.getValue();
                        z = true;
                    }
                }
                if (!z) {
                    CS0.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
                }
            }
            if (map.isEmpty()) {
                Iterator it2 = c3788fU0.d.entrySet().iterator();
                while (it2.hasNext()) {
                    FU0 fu1 = (FU0) ((Map.Entry) it2.next()).getValue();
                    if (fu1 == null) {
                        return null;
                    }
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    String str5 = fu1.c;
                    if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                            fu1.d = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        } catch (IllegalArgumentException e) {
                            CS0.c("data URL did not have correct base64 format.", e);
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry entry3 : c3788fU0.d.entrySet()) {
                if (((FU0) entry3.getValue()).d == null) {
                    return new JU0<>((Throwable) new IllegalStateException("There is no image for ".concat(((FU0) entry3.getValue()).c)));
                }
            }
            if (str != null) {
                C3998gU0.b.a.put(str, c3788fU0);
            }
            return new JU0<>(c3788fU0);
        } catch (IOException e2) {
            return new JU0<>((Throwable) e2);
        }
    }

    public static void h(boolean z) {
        ArrayList arrayList = new ArrayList(b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((LU0) arrayList.get(i)).a();
        }
    }

    public static String i(Context context, int i) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }
}
