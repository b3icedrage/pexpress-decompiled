package defpackage;

import io.jsonwebtoken.JwtParser;
import io.sentry.instrumentation.file.f;
import io.sentry.instrumentation.file.j;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: d20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3277d20 implements Closeable, Flushable {

    @NotNull
    public final File d;
    public final long e;

    @NotNull
    public final File g;

    @NotNull
    public final File h;

    @NotNull
    public final File i;
    public long j;

    @Nullable
    public C2814ao1 k;

    @NotNull
    public final LinkedHashMap<String, b> l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public long t;

    @NotNull
    public final C7839yX1 u;

    @NotNull
    public final C3696f20 v;

    @NotNull
    public static final Regex w = new Regex("[a-z0-9_-]{1,120}");

    @NotNull
    public static final String x = "CLEAN";

    @NotNull
    public static final String y = "DIRTY";

    @NotNull
    public static final String z = "REMOVE";

    @NotNull
    public static final String A = "READ";

    /* JADX INFO: renamed from: d20$a */
    public final class a {

        @NotNull
        public final b a;

        @Nullable
        public final boolean[] b;
        public boolean c;
        public final /* synthetic */ C3277d20 d;

        /* JADX INFO: renamed from: d20$a$a, reason: collision with other inner class name */
        public static final class C0336a extends ML0 implements Function1<IOException, Unit> {
            public final /* synthetic */ C3277d20 d;
            public final /* synthetic */ a e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0336a(C3277d20 c3277d20, a aVar) {
                super(1);
                this.d = c3277d20;
                this.e = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(IOException iOException) {
                IOException it = iOException;
                Intrinsics.checkNotNullParameter(it, "it");
                C3277d20 c3277d20 = this.d;
                a aVar = this.e;
                synchronized (c3277d20) {
                    aVar.c();
                }
                return Unit.a;
            }
        }

        public a(@NotNull C3277d20 c3277d20, b entry) {
            boolean[] zArr;
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.d = c3277d20;
            this.a = entry;
            if (entry.e) {
                zArr = null;
            } else {
                c3277d20.getClass();
                zArr = new boolean[2];
            }
            this.b = zArr;
        }

        public final void a() {
            C3277d20 c3277d20 = this.d;
            synchronized (c3277d20) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.a(this.a.g, this)) {
                        c3277d20.f(this, false);
                    }
                    this.c = true;
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            C3277d20 c3277d20 = this.d;
            synchronized (c3277d20) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.a(this.a.g, this)) {
                        c3277d20.f(this, true);
                    }
                    this.c = true;
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            b bVar = this.a;
            if (Intrinsics.a(bVar.g, this)) {
                C3277d20 c3277d20 = this.d;
                if (c3277d20.o) {
                    c3277d20.f(this, false);
                } else {
                    bVar.f = true;
                }
            }
        }

        @NotNull
        public final KM1 d(int i) {
            C3277d20 c3277d20 = this.d;
            synchronized (c3277d20) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!Intrinsics.a(this.a.g, this)) {
                        return new C1398Ks();
                    }
                    if (!this.a.e) {
                        boolean[] zArr = this.b;
                        Intrinsics.checkNotNull(zArr);
                        zArr[i] = true;
                    }
                    try {
                        return new C1740Pb0(C5208m0.e.p((File) this.a.d.get(i)), new C0336a(c3277d20, this));
                    } catch (FileNotFoundException unused) {
                        return new C1398Ks();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d20$b */
    public final class b {

        @NotNull
        public final String a;

        @NotNull
        public final long[] b;

        @NotNull
        public final ArrayList c;

        @NotNull
        public final ArrayList d;
        public boolean e;
        public boolean f;

        @Nullable
        public a g;
        public int h;
        public long i;
        public final /* synthetic */ C3277d20 j;

        public b(@NotNull C3277d20 c3277d20, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.j = c3277d20;
            this.a = key;
            c3277d20.getClass();
            this.b = new long[2];
            this.c = new ArrayList();
            this.d = new ArrayList();
            StringBuilder sb = new StringBuilder(key);
            sb.append(JwtParser.SEPARATOR_CHAR);
            int length = sb.length();
            for (int i = 0; i < 2; i++) {
                sb.append(i);
                this.c.add(new File(this.j.d, sb.toString()));
                sb.append(".tmp");
                this.d.add(new File(this.j.d, sb.toString()));
                sb.setLength(length);
            }
        }

        @Nullable
        public final c a() {
            byte[] bArr = C6806tc2.a;
            if (!this.e) {
                return null;
            }
            C3277d20 c3277d20 = this.j;
            if (!c3277d20.o && (this.g != null || this.f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.b.clone();
            for (int i = 0; i < 2; i++) {
                try {
                    File file = (File) this.c.get(i);
                    Intrinsics.checkNotNullParameter(file, "file");
                    Logger logger = J81.a;
                    Intrinsics.checkNotNullParameter(file, "<this>");
                    UN1 ia0 = new IA0(f.a.a(file, new FileInputStream(file)), LZ1.d);
                    if (!c3277d20.o) {
                        this.h++;
                        ia0 = new C3486e20(ia0, c3277d20, this);
                    }
                    arrayList.add(ia0);
                } catch (FileNotFoundException unused) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C6806tc2.d((UN1) it.next());
                    }
                    try {
                        c3277d20.A(this);
                        return null;
                    } catch (IOException unused2) {
                        return null;
                    }
                }
            }
            return new c(this.j, this.a, this.i, arrayList, jArr);
        }
    }

    /* JADX INFO: renamed from: d20$c */
    public final class c implements Closeable {

        @NotNull
        public final String d;
        public final long e;

        @NotNull
        public final ArrayList g;
        public final /* synthetic */ C3277d20 h;

        public c(@NotNull C3277d20 c3277d20, String key, @NotNull long j, @NotNull ArrayList sources, long[] lengths) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sources, "sources");
            Intrinsics.checkNotNullParameter(lengths, "lengths");
            this.h = c3277d20;
            this.d = key;
            this.e = j;
            this.g = sources;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                C6806tc2.d((UN1) it.next());
            }
        }
    }

    public C3277d20(@NotNull File directory, long j, @NotNull C8049zX1 taskRunner) {
        C5208m0 fileSystem = C5208m0.e;
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.d = directory;
        this.e = j;
        this.l = new LinkedHashMap<>(0, 0.75f, true);
        this.u = taskRunner.e();
        this.v = new C3696f20(this, C5807oq.b(new StringBuilder(), C6806tc2.g, " Cache"));
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.g = new File(directory, "journal");
        this.h = new File(directory, "journal.tmp");
        this.i = new File(directory, "journal.bkp");
    }

    public static void D(String str) {
        if (!w.d(str)) {
            throw new IllegalArgumentException(C1742Pc.d('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    public final void A(@NotNull b entry) throws IOException {
        C2814ao1 c2814ao1;
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!this.o) {
            if (entry.h > 0 && (c2814ao1 = this.k) != null) {
                c2814ao1.y0(y);
                c2814ao1.Y(32);
                c2814ao1.y0(entry.a);
                c2814ao1.Y(10);
                c2814ao1.flush();
            }
            if (entry.h > 0 || entry.g != null) {
                entry.f = true;
                return;
            }
        }
        a aVar = entry.g;
        if (aVar != null) {
            aVar.c();
        }
        for (int i = 0; i < 2; i++) {
            File file = (File) entry.c.get(i);
            Intrinsics.checkNotNullParameter(file, "file");
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
            long j = this.j;
            long[] jArr = entry.b;
            this.j = j - jArr[i];
            jArr[i] = 0;
        }
        this.m++;
        C2814ao1 c2814ao2 = this.k;
        String str = entry.a;
        if (c2814ao2 != null) {
            c2814ao2.y0(z);
            c2814ao2.Y(32);
            c2814ao2.y0(str);
            c2814ao2.Y(10);
        }
        this.l.remove(str);
        if (p()) {
            this.u.c(this.v, 0L);
        }
    }

    public final void C() throws IOException {
        while (this.j > this.e) {
            for (b toEvict : this.l.values()) {
                if (!toEvict.f) {
                    Intrinsics.checkNotNullExpressionValue(toEvict, "toEvict");
                    A(toEvict);
                }
            }
            return;
        }
        this.r = false;
    }

    public final synchronized void c() {
        if (this.q) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.p && !this.q) {
                Collection<b> collectionValues = this.l.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "lruEntries.values");
                for (b bVar : (b[]) collectionValues.toArray(new b[0])) {
                    a aVar = bVar.g;
                    if (aVar != null) {
                        aVar.c();
                    }
                }
                C();
                C2814ao1 c2814ao1 = this.k;
                Intrinsics.checkNotNull(c2814ao1);
                c2814ao1.close();
                this.k = null;
                this.q = true;
                return;
            }
            this.q = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(@NotNull a editor, boolean z2) {
        Intrinsics.checkNotNullParameter(editor, "editor");
        b bVar = editor.a;
        if (!Intrinsics.a(bVar.g, editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z2 && !bVar.e) {
            for (int i = 0; i < 2; i++) {
                boolean[] zArr = editor.b;
                Intrinsics.checkNotNull(zArr);
                if (!zArr[i]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                File file = (File) bVar.d.get(i);
                Intrinsics.checkNotNullParameter(file, "file");
                if (!file.exists()) {
                    editor.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            File file2 = (File) bVar.d.get(i2);
            if (!z2 || bVar.f) {
                Intrinsics.checkNotNullParameter(file2, "file");
                if (!file2.delete() && file2.exists()) {
                    throw new IOException("failed to delete " + file2);
                }
            } else {
                C5208m0 c5208m0 = C5208m0.e;
                if (c5208m0.k(file2)) {
                    File file3 = (File) bVar.c.get(i2);
                    c5208m0.o(file2, file3);
                    long j = bVar.b[i2];
                    Intrinsics.checkNotNullParameter(file3, "file");
                    long length = file3.length();
                    bVar.b[i2] = length;
                    this.j = (this.j - j) + length;
                }
            }
        }
        bVar.g = null;
        if (bVar.f) {
            A(bVar);
            return;
        }
        this.m++;
        C2814ao1 writer = this.k;
        Intrinsics.checkNotNull(writer);
        if (bVar.e || z2) {
            bVar.e = true;
            writer.y0(x);
            writer.Y(32);
            writer.y0(bVar.a);
            Intrinsics.checkNotNullParameter(writer, "writer");
            for (long j2 : bVar.b) {
                writer.Y(32);
                writer.o1(j2);
            }
            writer.Y(10);
            if (z2) {
                long j3 = this.t;
                this.t = 1 + j3;
                bVar.i = j3;
            }
        } else {
            this.l.remove(bVar.a);
            writer.y0(z);
            writer.Y(32);
            writer.y0(bVar.a);
            writer.Y(10);
        }
        writer.flush();
        if (this.j > this.e || p()) {
            this.u.c(this.v, 0L);
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.p) {
            c();
            C();
            C2814ao1 c2814ao1 = this.k;
            Intrinsics.checkNotNull(c2814ao1);
            c2814ao1.flush();
        }
    }

    @Nullable
    public final synchronized a g(@NotNull String key, long j) {
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            l();
            c();
            D(key);
            b bVar = this.l.get(key);
            if (j != -1 && (bVar == null || bVar.i != j)) {
                return null;
            }
            if ((bVar != null ? bVar.g : null) != null) {
                return null;
            }
            if (bVar != null && bVar.h != 0) {
                return null;
            }
            if (!this.r && !this.s) {
                C2814ao1 c2814ao1 = this.k;
                Intrinsics.checkNotNull(c2814ao1);
                c2814ao1.y0(y);
                c2814ao1.Y(32);
                c2814ao1.y0(key);
                c2814ao1.Y(10);
                c2814ao1.flush();
                if (this.n) {
                    return null;
                }
                if (bVar == null) {
                    bVar = new b(this, key);
                    this.l.put(key, bVar);
                }
                a aVar = new a(this, bVar);
                bVar.g = aVar;
                return aVar;
            }
            this.u.c(this.v, 0L);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Nullable
    public final synchronized c k(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        l();
        c();
        D(key);
        b bVar = this.l.get(key);
        if (bVar == null) {
            return null;
        }
        c cVarA = bVar.a();
        if (cVarA == null) {
            return null;
        }
        this.m++;
        C2814ao1 c2814ao1 = this.k;
        Intrinsics.checkNotNull(c2814ao1);
        c2814ao1.y0(A);
        c2814ao1.Y(32);
        c2814ao1.y0(key);
        c2814ao1.Y(10);
        if (p()) {
            this.u.c(this.v, 0L);
        }
        return cVarA;
    }

    public final synchronized void l() {
        boolean z2;
        try {
            byte[] bArr = C6806tc2.a;
            if (this.p) {
                return;
            }
            C5208m0 c5208m0 = C5208m0.e;
            if (c5208m0.k(this.i)) {
                if (c5208m0.k(this.g)) {
                    c5208m0.h(this.i);
                } else {
                    c5208m0.o(this.i, this.g);
                }
            }
            File file = this.i;
            Intrinsics.checkNotNullParameter(c5208m0, "<this>");
            Intrinsics.checkNotNullParameter(file, "file");
            C1190Ia1 c1190Ia1P = c5208m0.p(file);
            try {
                try {
                    c5208m0.h(file);
                    c1190Ia1P.close();
                    z2 = true;
                } catch (IOException unused) {
                    Unit unit = Unit.a;
                    c1190Ia1P.close();
                    c5208m0.h(file);
                    z2 = false;
                }
                this.o = z2;
                File file2 = this.g;
                Intrinsics.checkNotNullParameter(file2, "file");
                if (file2.exists()) {
                    try {
                        t();
                        q();
                        this.p = true;
                        return;
                    } catch (IOException e) {
                        C1903Rd1 c1903Rd1 = C1903Rd1.a;
                        C1903Rd1 c1903Rd2 = C1903Rd1.a;
                        String str = "DiskLruCache " + this.d + " is corrupt: " + e.getMessage() + ", removing";
                        c1903Rd2.getClass();
                        C1903Rd1.i(5, str, e);
                        try {
                            close();
                            C5208m0.e.i(this.d);
                            this.q = false;
                            v();
                            this.p = true;
                        } catch (Throwable th) {
                            this.q = false;
                            throw th;
                        }
                    }
                }
                v();
                this.p = true;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C6621sj.b(c1190Ia1P, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final boolean p() {
        int i = this.m;
        return i >= 2000 && i >= this.l.size();
    }

    public final void q() throws IOException {
        File file = this.h;
        C5208m0 c5208m0 = C5208m0.e;
        c5208m0.h(file);
        Iterator<b> it = this.l.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "i.next()");
            b bVar = next;
            int i = 0;
            if (bVar.g == null) {
                while (i < 2) {
                    this.j += bVar.b[i];
                    i++;
                }
            } else {
                bVar.g = null;
                while (i < 2) {
                    c5208m0.h((File) bVar.c.get(i));
                    c5208m0.h((File) bVar.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void t() throws IOException {
        C1190Ia1 c1190Ia1;
        File file = this.g;
        Intrinsics.checkNotNullParameter(file, "file");
        Logger logger = J81.a;
        Intrinsics.checkNotNullParameter(file, "<this>");
        C3024bo1 c3024bo1E = Cm2.e(new IA0(f.a.a(file, new FileInputStream(file)), LZ1.d));
        try {
            String strA = c3024bo1E.A(Long.MAX_VALUE);
            String strA2 = c3024bo1E.A(Long.MAX_VALUE);
            String strA3 = c3024bo1E.A(Long.MAX_VALUE);
            String strA4 = c3024bo1E.A(Long.MAX_VALUE);
            String strA5 = c3024bo1E.A(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Intrinsics.a(String.valueOf(201105), strA3) || !Intrinsics.a(String.valueOf(2), strA4) || strA5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    u(c3024bo1E.A(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.m = i - this.l.size();
                    if (c3024bo1E.c()) {
                        Intrinsics.checkNotNullParameter(file, "file");
                        try {
                            Logger logger2 = J81.a;
                            Intrinsics.checkNotNullParameter(file, "<this>");
                            FileOutputStream fileOutputStreamA = j.a.a(file, new FileOutputStream(file, true), true);
                            Intrinsics.checkNotNullParameter(fileOutputStreamA, "<this>");
                            c1190Ia1 = new C1190Ia1(fileOutputStreamA, new LZ1());
                        } catch (FileNotFoundException unused2) {
                            file.getParentFile().mkdirs();
                            Logger logger3 = J81.a;
                            Intrinsics.checkNotNullParameter(file, "<this>");
                            FileOutputStream fileOutputStreamA2 = j.a.a(file, new FileOutputStream(file, true), true);
                            Intrinsics.checkNotNullParameter(fileOutputStreamA2, "<this>");
                            c1190Ia1 = new C1190Ia1(fileOutputStreamA2, new LZ1());
                        }
                        this.k = Cm2.c(new C1740Pb0(c1190Ia1, new C3906g20(this, 0)));
                    } else {
                        v();
                    }
                    Unit unit = Unit.a;
                    c3024bo1E.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C6621sj.b(c3024bo1E, th);
                throw th2;
            }
        }
    }

    public final void u(String str) throws IOException {
        String strSubstring;
        int iF = StringsKt.F(' ', 0, 6, str);
        if (iF == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iF + 1;
        int iF2 = StringsKt.F(' ', i, 4, str);
        LinkedHashMap<String, b> linkedHashMap = this.l;
        if (iF2 == -1) {
            strSubstring = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = z;
            if (iF == str2.length() && d.o(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iF2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        b bVar = linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(this, strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        if (iF2 != -1) {
            String str3 = x;
            if (iF == str3.length() && d.o(str, str3, false)) {
                String strSubstring2 = str.substring(iF2 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List strings = StringsKt.R(strSubstring2, new char[]{' '});
                bVar.e = true;
                bVar.g = null;
                Intrinsics.checkNotNullParameter(strings, "strings");
                int size = strings.size();
                bVar.j.getClass();
                if (size != 2) {
                    throw new IOException("unexpected journal line: " + strings);
                }
                try {
                    int size2 = strings.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        bVar.b[i2] = Long.parseLong((String) strings.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + strings);
                }
            }
        }
        if (iF2 == -1) {
            String str4 = y;
            if (iF == str4.length() && d.o(str, str4, false)) {
                bVar.g = new a(this, bVar);
                return;
            }
        }
        if (iF2 == -1) {
            String str5 = A;
            if (iF == str5.length() && d.o(str, str5, false)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void v() {
        C1190Ia1 c1190Ia1;
        int i = 0;
        synchronized (this) {
            try {
                C2814ao1 c2814ao1 = this.k;
                if (c2814ao1 != null) {
                    c2814ao1.close();
                }
                C2814ao1 writer = Cm2.c(C5208m0.e.p(this.h));
                try {
                    writer.y0("libcore.io.DiskLruCache");
                    writer.Y(10);
                    writer.y0("1");
                    writer.Y(10);
                    writer.o1(201105);
                    writer.Y(10);
                    writer.o1(2);
                    writer.Y(10);
                    writer.Y(10);
                    for (b bVar : this.l.values()) {
                        if (bVar.g != null) {
                            writer.y0(y);
                            writer.Y(32);
                            writer.y0(bVar.a);
                            writer.Y(10);
                        } else {
                            writer.y0(x);
                            writer.Y(32);
                            writer.y0(bVar.a);
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            for (long j : bVar.b) {
                                writer.Y(32);
                                writer.o1(j);
                            }
                            writer.Y(10);
                        }
                    }
                    Unit unit = Unit.a;
                    writer.close();
                    C5208m0 c5208m0 = C5208m0.e;
                    if (c5208m0.k(this.g)) {
                        c5208m0.o(this.g, this.i);
                    }
                    c5208m0.o(this.h, this.g);
                    c5208m0.h(this.i);
                    File file = this.g;
                    Intrinsics.checkNotNullParameter(file, "file");
                    try {
                        Logger logger = J81.a;
                        Intrinsics.checkNotNullParameter(file, "<this>");
                        FileOutputStream fileOutputStreamA = j.a.a(file, new FileOutputStream(file, true), true);
                        Intrinsics.checkNotNullParameter(fileOutputStreamA, "<this>");
                        c1190Ia1 = new C1190Ia1(fileOutputStreamA, new LZ1());
                    } catch (FileNotFoundException unused) {
                        file.getParentFile().mkdirs();
                        Logger logger2 = J81.a;
                        Intrinsics.checkNotNullParameter(file, "<this>");
                        FileOutputStream fileOutputStreamA2 = j.a.a(file, new FileOutputStream(file, true), true);
                        Intrinsics.checkNotNullParameter(fileOutputStreamA2, "<this>");
                        c1190Ia1 = new C1190Ia1(fileOutputStreamA2, new LZ1());
                    }
                    this.k = Cm2.c(new C1740Pb0(c1190Ia1, new C3906g20(this, i)));
                    this.n = false;
                    this.s = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C6621sj.b(writer, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
