package defpackage;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import io.jsonwebtoken.JwtParser;
import io.sentry.instrumentation.file.f;
import io.sentry.instrumentation.file.j;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: c20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3067c20 implements Closeable {
    public final File d;
    public final File e;
    public final File g;
    public final File h;
    public final long j;
    public BufferedWriter m;
    public int o;
    public long l = 0;
    public final LinkedHashMap<String, d> n = new LinkedHashMap<>(0, 0.75f, true);
    public long p = 0;
    public final ThreadPoolExecutor q = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());
    public final a r = new a();
    public final int i = 1;
    public final int k = 1;

    /* JADX INFO: renamed from: c20$a */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() {
            synchronized (C3067c20.this) {
                try {
                    C3067c20 c3067c20 = C3067c20.this;
                    if (c3067c20.m == null) {
                        return null;
                    }
                    c3067c20.G();
                    if (C3067c20.this.q()) {
                        C3067c20.this.C();
                        C3067c20.this.o = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c20$b */
    public static final class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* JADX INFO: renamed from: c20$c */
    public final class c {
        public final d a;
        public final boolean[] b;
        public boolean c;

        public c(d dVar) {
            this.a = dVar;
            this.b = dVar.e ? null : new boolean[C3067c20.this.k];
        }

        public final void a() {
            C3067c20.c(C3067c20.this, this, false);
        }

        public final File b() {
            File file;
            synchronized (C3067c20.this) {
                try {
                    d dVar = this.a;
                    if (dVar.f != this) {
                        throw new IllegalStateException();
                    }
                    if (!dVar.e) {
                        this.b[0] = true;
                    }
                    file = dVar.d[0];
                    C3067c20.this.d.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return file;
        }
    }

    /* JADX INFO: renamed from: c20$d */
    public final class d {
        public final String a;
        public final long[] b;
        public final File[] c;
        public final File[] d;
        public boolean e;
        public c f;

        public d(String str) {
            this.a = str;
            int i = C3067c20.this.k;
            this.b = new long[i];
            this.c = new File[i];
            this.d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append(JwtParser.SEPARATOR_CHAR);
            int length = sb.length();
            for (int i2 = 0; i2 < C3067c20.this.k; i2++) {
                sb.append(i2);
                File[] fileArr = this.c;
                String string = sb.toString();
                File file = C3067c20.this.d;
                fileArr[i2] = new File(file, string);
                sb.append(".tmp");
                this.d[i2] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }

        public final String a() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: c20$e */
    public final class e {
        public final File[] a;

        public e(File[] fileArr) {
            this.a = fileArr;
        }
    }

    public C3067c20(File file, long j) {
        this.d = file;
        this.e = new File(file, "journal");
        this.g = new File(file, "journal.tmp");
        this.h = new File(file, "journal.bkp");
        this.j = j;
    }

    public static void D(File file, File file2, boolean z) throws IOException {
        if (z) {
            g(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void c(C3067c20 c3067c20, c cVar, boolean z) {
        synchronized (c3067c20) {
            d dVar = cVar.a;
            if (dVar.f != cVar) {
                throw new IllegalStateException();
            }
            if (z && !dVar.e) {
                for (int i = 0; i < c3067c20.k; i++) {
                    if (!cVar.b[i]) {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!dVar.d[i].exists()) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < c3067c20.k; i2++) {
                File file = dVar.d[i2];
                if (!z) {
                    g(file);
                } else if (file.exists()) {
                    File file2 = dVar.c[i2];
                    file.renameTo(file2);
                    long j = dVar.b[i2];
                    long length = file2.length();
                    dVar.b[i2] = length;
                    c3067c20.l = (c3067c20.l - j) + length;
                }
            }
            c3067c20.o++;
            dVar.f = null;
            if (dVar.e || z) {
                dVar.e = true;
                c3067c20.m.append((CharSequence) "CLEAN");
                c3067c20.m.append(' ');
                c3067c20.m.append((CharSequence) dVar.a);
                c3067c20.m.append((CharSequence) dVar.a());
                c3067c20.m.append('\n');
                if (z) {
                    c3067c20.p++;
                }
            } else {
                c3067c20.n.remove(dVar.a);
                c3067c20.m.append((CharSequence) "REMOVE");
                c3067c20.m.append(' ');
                c3067c20.m.append((CharSequence) dVar.a);
                c3067c20.m.append('\n');
            }
            l(c3067c20.m);
            if (c3067c20.l > c3067c20.j || c3067c20.q()) {
                c3067c20.q.submit(c3067c20.r);
            }
        }
    }

    @TargetApi(26)
    public static void f(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void g(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void l(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static C3067c20 t(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                D(file2, file3, false);
            }
        }
        C3067c20 c3067c20 = new C3067c20(file, j);
        if (c3067c20.e.exists()) {
            try {
                c3067c20.v();
                c3067c20.u();
                return c3067c20;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                c3067c20.close();
                C7226vc2.a(c3067c20.d);
            }
        }
        file.mkdirs();
        C3067c20 c3067c21 = new C3067c20(file, j);
        c3067c21.C();
        return c3067c21;
    }

    public final void A(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap<String, d> linkedHashMap = this.n;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        d dVar = linkedHashMap.get(strSubstring);
        if (dVar == null) {
            dVar = new d(strSubstring);
            linkedHashMap.put(strSubstring, dVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f = new c(dVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        dVar.e = true;
        dVar.f = null;
        if (strArrSplit.length != C3067c20.this.k) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                dVar.b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void C() {
        try {
            BufferedWriter bufferedWriter = this.m;
            if (bufferedWriter != null) {
                f(bufferedWriter);
            }
            File file = this.g;
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(j.a.b(new FileOutputStream(file), file), C7226vc2.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.i));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.k));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (d dVar : this.n.values()) {
                    if (dVar.f != null) {
                        bufferedWriter2.write("DIRTY " + dVar.a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + dVar.a + dVar.a() + '\n');
                    }
                }
                f(bufferedWriter2);
                if (this.e.exists()) {
                    D(this.e, this.h, true);
                }
                D(this.g, this.e, false);
                this.h.delete();
                File file2 = this.e;
                this.m = new BufferedWriter(new OutputStreamWriter(j.a.a(file2, new FileOutputStream(file2, true), true), C7226vc2.a));
            } catch (Throwable th) {
                f(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void G() {
        while (this.l > this.j) {
            String key = this.n.entrySet().iterator().next().getKey();
            synchronized (this) {
                try {
                    if (this.m == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    d dVar = this.n.get(key);
                    if (dVar != null && dVar.f == null) {
                        for (int i = 0; i < this.k; i++) {
                            File file = dVar.c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.l;
                            long[] jArr = dVar.b;
                            this.l = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.o++;
                        this.m.append((CharSequence) "REMOVE");
                        this.m.append(' ');
                        this.m.append((CharSequence) key);
                        this.m.append('\n');
                        this.n.remove(key);
                        if (q()) {
                            this.q.submit(this.r);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.m == null) {
                return;
            }
            Iterator it = new ArrayList(this.n.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            G();
            f(this.m);
            this.m = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final c k(String str) {
        synchronized (this) {
            try {
                if (this.m == null) {
                    throw new IllegalStateException("cache is closed");
                }
                d dVar = this.n.get(str);
                if (dVar == null) {
                    dVar = new d(str);
                    this.n.put(str, dVar);
                } else if (dVar.f != null) {
                    return null;
                }
                c cVar = new c(dVar);
                dVar.f = cVar;
                this.m.append((CharSequence) "DIRTY");
                this.m.append(' ');
                this.m.append((CharSequence) str);
                this.m.append('\n');
                l(this.m);
                return cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized e p(String str) {
        if (this.m == null) {
            throw new IllegalStateException("cache is closed");
        }
        d dVar = this.n.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.e) {
            return null;
        }
        for (File file : dVar.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.o++;
        this.m.append((CharSequence) "READ");
        this.m.append(' ');
        this.m.append((CharSequence) str);
        this.m.append('\n');
        if (q()) {
            this.q.submit(this.r);
        }
        return new e(dVar.c);
    }

    public final boolean q() {
        int i = this.o;
        return i >= 2000 && i >= this.n.size();
    }

    public final void u() throws IOException {
        g(this.g);
        Iterator<d> it = this.n.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f;
            int i = this.k;
            int i2 = 0;
            if (cVar == null) {
                while (i2 < i) {
                    this.l += next.b[i2];
                    i2++;
                }
            } else {
                next.f = null;
                while (i2 < i) {
                    g(next.c[i2]);
                    g(next.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void v() {
        File file = this.e;
        C4203hS1 c4203hS1 = new C4203hS1(f.a.a(file, new FileInputStream(file)), C7226vc2.a);
        try {
            String strC = c4203hS1.c();
            String strC2 = c4203hS1.c();
            String strC3 = c4203hS1.c();
            String strC4 = c4203hS1.c();
            String strC5 = c4203hS1.c();
            if (!"libcore.io.DiskLruCache".equals(strC) || !"1".equals(strC2) || !Integer.toString(this.i).equals(strC3) || !Integer.toString(this.k).equals(strC4) || !"".equals(strC5)) {
                throw new IOException("unexpected journal header: [" + strC + ", " + strC2 + ", " + strC4 + ", " + strC5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    A(c4203hS1.c());
                    i++;
                } catch (EOFException unused) {
                    this.o = i - this.n.size();
                    if (c4203hS1.i == -1) {
                        C();
                    } else {
                        this.m = new BufferedWriter(new OutputStreamWriter(j.a.a(file, new FileOutputStream(file, true), true), C7226vc2.a));
                    }
                    try {
                        c4203hS1.close();
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                c4203hS1.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }
}
