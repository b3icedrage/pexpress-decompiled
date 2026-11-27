package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import io.sentry.instrumentation.file.f;
import io.sentry.instrumentation.file.j;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: h90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4144h90 {

    @NotNull
    public static final ConcurrentHashMap<String, InterfaceC4117h21> l = new ConcurrentHashMap<>();

    @NotNull
    public static final ConcurrentHashMap<String, InterfaceC4117h21> m = new ConcurrentHashMap<>();

    @NotNull
    public final File a;

    @NotNull
    public final String b;

    @NotNull
    public final C5330mb c;

    @NotNull
    public final DS0 d;

    @NotNull
    public final R00 e;

    @NotNull
    public final String f;

    @NotNull
    public final String g;

    @NotNull
    public final Set<String> h;

    @NotNull
    public final ConcurrentHashMap i;
    public final InterfaceC4117h21 j;
    public final InterfaceC4117h21 k;

    /* JADX INFO: renamed from: h90$a */
    public static final class a extends ML0 implements Function1<JSONObject, CharSequence> {
        public static final a d = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(JSONObject jSONObject) {
            JSONObject it = jSONObject;
            Intrinsics.checkNotNullParameter(it, "it");
            String string = it.toString();
            Intrinsics.checkNotNullExpressionValue(string, "it.toString()");
            return d.m(string, "\u0000", "");
        }
    }

    public C4144h90(@NotNull File directory, @NotNull String storageKey, @NotNull C5330mb kvs, @NotNull DS0 logger, @NotNull R00 diagnostics) throws Throwable {
        InterfaceC4117h21 interfaceC4117h21PutIfAbsent;
        InterfaceC4117h21 interfaceC4117h21PutIfAbsent2;
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(storageKey, "storageKey");
        Intrinsics.checkNotNullParameter(kvs, "kvs");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(diagnostics, "diagnostics");
        this.a = directory;
        this.b = storageKey;
        this.c = kvs;
        this.d = logger;
        this.e = diagnostics;
        this.f = C5491nL.c("amplitude.events.file.index.", storageKey);
        this.g = C5491nL.c("amplitude.events.file.version.", storageKey);
        Set<String> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(ConcurrentHashMap())");
        this.h = setNewSetFromMap;
        this.i = new ConcurrentHashMap();
        ConcurrentHashMap<String, InterfaceC4117h21> concurrentHashMap = l;
        InterfaceC4117h21 interfaceC4117h21C = concurrentHashMap.get(storageKey);
        if (interfaceC4117h21C == null && (interfaceC4117h21PutIfAbsent2 = concurrentHashMap.putIfAbsent(storageKey, (interfaceC4117h21C = ED.c()))) != null) {
            interfaceC4117h21C = interfaceC4117h21PutIfAbsent2;
        }
        this.j = interfaceC4117h21C;
        ConcurrentHashMap<String, InterfaceC4117h21> concurrentHashMap2 = m;
        InterfaceC4117h21 interfaceC4117h21C2 = concurrentHashMap2.get(storageKey);
        if (interfaceC4117h21C2 == null && (interfaceC4117h21PutIfAbsent = concurrentHashMap2.putIfAbsent(storageKey, (interfaceC4117h21C2 = ED.c()))) != null) {
            interfaceC4117h21C2 = interfaceC4117h21PutIfAbsent;
        }
        this.k = interfaceC4117h21C2;
        f();
        C5189lv.o(new C2886b90(this, null));
    }

    public static final String a(C4144h90 c4144h90, File file) {
        c4144h90.getClass();
        String strM = d.m(C6179qd0.f(file), c4144h90.b + '-', "");
        int iF = StringsKt.F('-', 0, 6, strM);
        if (iF < 0) {
            return strM;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = strM.substring(0, iF);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(StringsKt.L(10, strSubstring));
        String strSubstring2 = strM.substring(iF);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring2);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object b(final C4144h90 c4144h90, LM lm) {
        C3305d90 c3305d90;
        InterfaceC4117h21 writeMutex;
        c4144h90.getClass();
        if (lm instanceof C3305d90) {
            c3305d90 = (C3305d90) lm;
            int i = c3305d90.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3305d90.i = i - Integer.MIN_VALUE;
            } else {
                c3305d90 = new C3305d90(c4144h90, lm);
            }
        } else {
            c3305d90 = new C3305d90(c4144h90, lm);
        }
        Object obj = c3305d90.g;
        MN mn = MN.d;
        int i2 = c3305d90.i;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            writeMutex = c4144h90.j;
            Intrinsics.checkNotNullExpressionValue(writeMutex, "writeMutex");
            c3305d90.d = c4144h90;
            c3305d90.e = writeMutex;
            c3305d90.i = 1;
            if (writeMutex.a(c3305d90) == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC4117h21 interfaceC4117h21 = c3305d90.e;
            C4144h90 c4144h91 = c3305d90.d;
            C1795Pt1.b(obj);
            writeMutex = interfaceC4117h21;
            c4144h90 = c4144h91;
        }
        try {
            C5330mb c5330mb = c4144h90.c;
            String str = c4144h90.g;
            if (c5330mb.b(str, 1L) <= 1) {
                File[] fileArrListFiles = c4144h90.a.listFiles(new FilenameFilter() { // from class: a90
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file, String name) {
                        C4144h90 this$0 = this.a;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullExpressionValue(name, "name");
                        return StringsKt.C(name, this$0.b, false) && !d.h(name, ".properties", false);
                    }
                });
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                for (File it : fileArrListFiles) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    String strA = C5759od0.a(it);
                    if (!d.h(strA, "\u0000", false)) {
                        String str2 = '[' + StringsKt.e0(StringsKt.g0(strA, '[', ','), ']', ',') + ']';
                        try {
                            c4144h90.k(C0957Fb.B(new JSONArray(str2)), it, false);
                            if (Intrinsics.a(C6179qd0.e(it), "tmp")) {
                                c4144h90.d(it);
                            }
                        } catch (JSONException unused) {
                            c4144h90.d.error("Failed to parse events: " + str2 + ", dropping file: " + it.getPath());
                            String path = it.getPath();
                            Intrinsics.checkNotNullExpressionValue(path, "it.path");
                            c4144h90.g(path);
                        }
                    }
                }
                c4144h90.c.c(str, 2L);
            }
            Unit unit = Unit.a;
            writeMutex.b(null);
            return Unit.a;
        } catch (Throwable th) {
            writeMutex.b(null);
            throw th;
        }
    }

    public final File c() {
        ConcurrentHashMap concurrentHashMap = this.i;
        String str = this.b;
        File file = (File) concurrentHashMap.get(str);
        File file2 = this.a;
        if (file == null) {
            File[] fileArrListFiles = file2.listFiles(new FilenameFilter() { // from class: Z80
                @Override // java.io.FilenameFilter
                public final boolean accept(File file3, String name) {
                    C4144h90 this_run = this.a;
                    Intrinsics.checkNotNullParameter(this_run, "$this_run");
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    return StringsKt.C(name, this_run.b, false) && d.h(name, ".tmp", false);
                }
            });
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            file = (File) C1526Mj.t(fileArrListFiles, 0);
        }
        long jB = this.c.b(this.f, 0L);
        if (file == null) {
            file = new File(file2, str + '-' + jB + ".tmp");
        }
        concurrentHashMap.put(str, file);
        Object obj = concurrentHashMap.get(str);
        Intrinsics.checkNotNull(obj);
        return (File) obj;
    }

    public final void d(File file) {
        h(file);
        C5330mb c5330mb = this.c;
        String str = this.f;
        c5330mb.c(str, c5330mb.b(str, 0L) + 1);
        this.i.remove(this.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Nullable
    public final Object e(@NotNull String str, @NotNull LM lm) {
        C3095c90 c3095c90;
        String str2;
        InterfaceC4117h21 interfaceC4117h21;
        C4144h90 c4144h90;
        if (lm instanceof C3095c90) {
            c3095c90 = (C3095c90) lm;
            int i = c3095c90.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3095c90.j = i - Integer.MIN_VALUE;
            } else {
                c3095c90 = new C3095c90(this, lm);
            }
        } else {
            c3095c90 = new C3095c90(this, lm);
        }
        Object obj = c3095c90.h;
        MN mn = MN.d;
        int i2 = c3095c90.j;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            InterfaceC4117h21 readMutex = this.k;
            Intrinsics.checkNotNullExpressionValue(readMutex, "readMutex");
            c3095c90.d = this;
            str2 = str;
            c3095c90.e = str2;
            c3095c90.g = readMutex;
            c3095c90.j = 1;
            if (readMutex.a(c3095c90) == mn) {
                return mn;
            }
            interfaceC4117h21 = readMutex;
            c4144h90 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC4117h21 = c3095c90.g;
            str2 = c3095c90.e;
            c4144h90 = c3095c90.d;
            C1795Pt1.b(obj);
        }
        try {
            boolean zContains = c4144h90.h.contains(str2);
            String string = "";
            Set<String> set = c4144h90.h;
            if (zContains) {
                set.remove(str2);
            } else {
                set.add(str2);
                File file = new File(str2);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(f.a.a(file, new FileInputStream(file)), Charsets.UTF_8), 8192);
                try {
                    String strN = C0648Bc.n(bufferedReader);
                    boolean zH = d.h(strN, "\u0000", false);
                    DS0 ds0 = c4144h90.d;
                    R00 r00 = c4144h90.e;
                    if (zH) {
                        JSONArray jSONArray = new JSONArray();
                        for (String event : StringsKt__StringsKt.split$default(strN, new String[]{"\u0000"}, false, 0, 6, null)) {
                            if (event.length() > 0) {
                                try {
                                    jSONArray.put(new JSONObject(event));
                                } catch (JSONException unused) {
                                    r00.getClass();
                                    Intrinsics.checkNotNullParameter(event, "event");
                                    if (r00.a == null) {
                                        r00.a = Collections.synchronizedList(new ArrayList());
                                    }
                                    List<String> list = r00.a;
                                    if (list != null) {
                                        list.add(event);
                                    }
                                    ds0.error("Failed to parse event: " + event);
                                }
                            }
                        }
                        string = jSONArray.length() > 0 ? jSONArray.toString() : "";
                        Intrinsics.checkNotNullExpressionValue(string, "if (events.length() > 0)… \"\"\n                    }");
                    } else {
                        String event2 = "[" + StringsKt.e0(StringsKt.g0(strN, '[', ','), ']', ',') + ']';
                        try {
                            String string2 = new JSONArray(event2).toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "jsonArray.toString()");
                            string = string2;
                        } catch (JSONException unused2) {
                            r00.getClass();
                            Intrinsics.checkNotNullParameter(event2, "event");
                            if (r00.a == null) {
                                r00.a = Collections.synchronizedList(new ArrayList());
                            }
                            List<String> list2 = r00.a;
                            if (list2 != null) {
                                list2.add(event2);
                            }
                            ds0.error("Failed to parse events: " + event2 + ", dropping file: " + str2);
                            c4144h90.g(str2);
                            string = event2;
                        }
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C6621sj.b(bufferedReader, th);
                        throw th2;
                    }
                }
            }
            interfaceC4117h21.b(null);
            return string;
        } catch (Throwable th3) {
            interfaceC4117h21.b(null);
            throw th3;
        }
    }

    public final boolean f() {
        File file = this.a;
        try {
            U0.g(file);
            return true;
        } catch (IOException e) {
            this.e.a("Failed to create directory: " + e.getMessage());
            this.d.error("Failed to create directory for events storage: " + file.getPath());
            return false;
        }
    }

    public final boolean g(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.h.remove(filePath);
        return new File(filePath).delete();
    }

    public final void h(File file) {
        if (!file.exists() || C6179qd0.e(file).length() == 0) {
            return;
        }
        String strF = C6179qd0.f(file);
        File file2 = this.a;
        File file3 = new File(file2, strF);
        if (!file3.exists()) {
            file.renameTo(new File(file2, C6179qd0.f(file)));
            return;
        }
        this.d.a("File already exists: " + file3 + ", handle gracefully.");
        file.renameTo(new File(file2, strF + '-' + System.currentTimeMillis() + '-' + new Random().nextInt(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object i(@NotNull LM lm) {
        C3724f90 c3724f90;
        C4144h90 c4144h90;
        InterfaceC4117h21 interfaceC4117h21;
        if (lm instanceof C3724f90) {
            c3724f90 = (C3724f90) lm;
            int i = c3724f90.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3724f90.i = i - Integer.MIN_VALUE;
            } else {
                c3724f90 = new C3724f90(this, lm);
            }
        } else {
            c3724f90 = new C3724f90(this, lm);
        }
        Object obj = c3724f90.g;
        MN mn = MN.d;
        int i2 = c3724f90.i;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            InterfaceC4117h21 writeMutex = this.j;
            Intrinsics.checkNotNullExpressionValue(writeMutex, "writeMutex");
            c3724f90.d = this;
            c3724f90.e = writeMutex;
            c3724f90.i = 1;
            if (writeMutex.a(c3724f90) == mn) {
                return mn;
            }
            c4144h90 = this;
            interfaceC4117h21 = writeMutex;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC4117h21 = c3724f90.e;
            c4144h90 = c3724f90.d;
            C1795Pt1.b(obj);
        }
        try {
            File fileC = c4144h90.c();
            if (fileC.exists() && fileC.length() > 0) {
                c4144h90.d(fileC);
            }
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            interfaceC4117h21.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a4 A[Catch: all -> 0x006e, TRY_LEAVE, TryCatch #2 {all -> 0x006e, blocks: (B:19:0x0052, B:40:0x0109, B:22:0x005a, B:25:0x006a, B:31:0x0099, B:33:0x00a4, B:35:0x00b1, B:38:0x00b6, B:39:0x00e3, B:30:0x0072), top: B:49:0x0052, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object j(@NotNull String str, @NotNull LM lm) {
        C3934g90 c3934g90;
        InterfaceC4117h21 writeMutex;
        C4144h90 c4144h90;
        if (lm instanceof C3934g90) {
            c3934g90 = (C3934g90) lm;
            int i = c3934g90.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3934g90.j = i - Integer.MIN_VALUE;
            } else {
                c3934g90 = new C3934g90(this, lm);
            }
        } else {
            c3934g90 = new C3934g90(this, lm);
        }
        Object obj = c3934g90.h;
        MN mn = MN.d;
        int i2 = c3934g90.j;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            writeMutex = this.j;
            Intrinsics.checkNotNullExpressionValue(writeMutex, "writeMutex");
            c3934g90.d = this;
            c3934g90.e = str;
            c3934g90.g = writeMutex;
            c3934g90.j = 1;
            if (writeMutex.a(c3934g90) == mn) {
                return mn;
            }
            c4144h90 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC4117h21 interfaceC4117h21 = c3934g90.g;
            String str2 = c3934g90.e;
            c4144h90 = c3934g90.d;
            C1795Pt1.b(obj);
            writeMutex = interfaceC4117h21;
            str = str2;
        }
        try {
            if (c4144h90.f()) {
                File fileC = c4144h90.c();
                boolean zExists = fileC.exists();
                DS0 ds0 = c4144h90.d;
                R00 r00 = c4144h90.e;
                if (zExists) {
                    while (fileC.length() > 975000) {
                        c4144h90.d(fileC);
                        fileC = c4144h90.c();
                        if (!fileC.exists()) {
                            fileC.createNewFile();
                        }
                    }
                    byte[] bytes = (d.m(str, "\u0000", "") + (char) 0).getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    c4144h90.l(bytes, fileC, true);
                } else {
                    try {
                        fileC.createNewFile();
                        while (fileC.length() > 975000) {
                            c4144h90.d(fileC);
                            fileC = c4144h90.c();
                            if (!fileC.exists()) {
                                try {
                                    fileC.createNewFile();
                                } catch (IOException e) {
                                    r00.a("Failed to create new storage file: " + e.getMessage());
                                    ds0.error("Failed to create new storage file: " + fileC.getPath());
                                    Unit unit = Unit.a;
                                    writeMutex.b(null);
                                    return Unit.a;
                                }
                            }
                        }
                        byte[] bytes2 = (d.m(str, "\u0000", "") + (char) 0).getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                        c4144h90.l(bytes2, fileC, true);
                    } catch (IOException e2) {
                        r00.a("Failed to create new storage file: " + e2.getMessage());
                        ds0.error("Failed to create new storage file: " + fileC.getPath());
                    }
                }
            }
            Unit unit2 = Unit.a;
            writeMutex.b(null);
            return Unit.a;
        } catch (Throwable th) {
            writeMutex.b(null);
            throw th;
        }
    }

    public final void k(List<? extends JSONObject> list, File file, boolean z) {
        DS0 ds0 = this.d;
        R00 r00 = this.e;
        try {
            String strJ = CollectionsKt.J(list, "\u0000", null, "\u0000", a.d, 26);
            file.createNewFile();
            byte[] bytes = strJ.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            l(bytes, file, z);
            h(file);
        } catch (IOException e) {
            r00.a("Failed to create or write to split file: " + e.getMessage());
            ds0.error("Failed to create or write to split file: " + file.getPath());
        } catch (Exception e2) {
            r00.a("Failed to write to split file: " + e2.getMessage());
            ds0.error("Failed to write to split file: " + file.getPath() + " for error: " + e2.getMessage());
        }
    }

    public final void l(byte[] bArr, File file, boolean z) {
        DS0 ds0 = this.d;
        R00 r00 = this.e;
        try {
            FileOutputStream fileOutputStreamA = j.a.a(file, new FileOutputStream(file, z), z);
            try {
                fileOutputStreamA.write(bArr);
                fileOutputStreamA.flush();
                Unit unit = Unit.a;
                fileOutputStreamA.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C6621sj.b(fileOutputStreamA, th);
                    throw th2;
                }
            }
        } catch (FileNotFoundException e) {
            r00.a("Error writing to file: " + e.getMessage());
            ds0.error("File not found: " + file.getPath());
        } catch (IOException e2) {
            r00.a("Error writing to file: " + e2.getMessage());
            ds0.error("Failed to write to file: " + file.getPath());
        } catch (SecurityException e3) {
            r00.a("Error writing to file: " + e3.getMessage());
            ds0.error("Security exception when saving event: " + e3.getMessage());
        } catch (Exception e4) {
            r00.a("Error writing to file: " + e4.getMessage());
            ds0.error("Failed to write to file: " + file.getPath());
        }
    }
}
