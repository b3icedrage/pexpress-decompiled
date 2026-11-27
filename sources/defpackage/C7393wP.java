package defpackage;

import androidx.annotation.NonNull;
import io.sentry.android.core.b0;
import io.sentry.instrumentation.file.f;
import io.sentry.instrumentation.file.j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: wP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7393wP {
    public static final Charset d = Charset.forName("UTF-8");
    public static final int e = 15;
    public static final C6342rP f = new C6342rP();
    public static final C6552sP g = new C6552sP();
    public static final C6762tP h = new C6762tP();
    public final AtomicInteger a = new AtomicInteger(0);
    public final C4448id0 b;

    @NonNull
    public final C7587xJ1 c;

    public C7393wP(C4448id0 c4448id0, C7587xJ1 c7587xJ1) {
        this.b = c4448id0;
        this.c = c7587xJ1;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    @NonNull
    public static String e(@NonNull File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStreamA = f.a.a(file, new FileInputStream(file));
        while (true) {
            try {
                int i = fileInputStreamA.read(bArr);
                if (i <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), d);
                    fileInputStreamA.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                try {
                    fileInputStreamA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(j.a.b(new FileOutputStream(file), file), d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        C4448id0 c4448id0 = this.b;
        arrayList.addAll(C4448id0.e(c4448id0.e.listFiles()));
        arrayList.addAll(C4448id0.e(c4448id0.f.listFiles()));
        C6552sP c6552sP = g;
        Collections.sort(arrayList, c6552sP);
        List listE = C4448id0.e(c4448id0.d.listFiles());
        Collections.sort(listE, c6552sP);
        arrayList.addAll(listE);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(C4448id0.e(this.b.c.list())).descendingSet();
    }

    public final void d(@NonNull C4070go c4070go, @NonNull String str, boolean z) {
        C4448id0 c4448id0 = this.b;
        C6326rJ1.b bVar = this.c.b().a;
        f.getClass();
        YK yk = C6342rP.a;
        yk.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            DG0 dg0 = (DG0) yk.d;
            WH0 wh0 = new WH0(stringWriter, dg0.a, dg0.b, dg0.c, dg0.d);
            wh0.g(c4070go);
            wh0.i();
            wh0.b.flush();
        } catch (IOException unused) {
        }
        try {
            f(c4448id0.b(str, C1039Gc0.d("event", String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z ? "_" : "")), stringWriter.toString());
        } catch (IOException e2) {
            b0.f("FirebaseCrashlytics", "Could not persist event for session " + str, e2);
        }
        C6972uP c6972uP = new C6972uP();
        c4448id0.getClass();
        File file = new File(c4448id0.c, str);
        file.mkdirs();
        List<File> listE = C4448id0.e(file.listFiles(c6972uP));
        Collections.sort(listE, new C7182vP());
        int size = listE.size();
        for (File file2 : listE) {
            if (size <= bVar.a) {
                return;
            }
            C4448id0.d(file2);
            size--;
        }
    }
}
