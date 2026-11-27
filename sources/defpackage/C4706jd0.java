package defpackage;

import com.google.android.gms.common.api.Api;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4706jd0 implements Sequence<File> {

    @NotNull
    public final File a;

    @NotNull
    public final FileWalkDirection b;

    @Nullable
    public final Function1<File, Boolean> c;

    @Nullable
    public final Function1<File, Unit> d;

    @Nullable
    public final Function2<File, IOException, Unit> e;
    public final int f;

    /* JADX INFO: renamed from: jd0$a */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull File rootDir) {
            super(rootDir);
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    /* JADX INFO: renamed from: jd0$b */
    public final class b extends AbstractC4785k0<File> {

        @NotNull
        public final ArrayDeque<c> g;

        /* JADX INFO: renamed from: jd0$b$a */
        public final class a extends a {
            public boolean b;

            @Nullable
            public File[] c;
            public int d;
            public boolean e;
            public final /* synthetic */ b f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0044  */
            /* JADX WARN: Code duplicated, block: B:21:0x004c  */
            /* JADX WARN: Code duplicated, block: B:25:0x005e  */
            /* JADX WARN: Code duplicated, block: B:27:0x0061  */
            /* JADX WARN: Code duplicated, block: B:29:0x0067  */
            @Override // defpackage.C4706jd0.c
            @Nullable
            public final File a() {
                File[] fileArr;
                Function1<File, Unit> function1;
                int i;
                boolean z = this.e;
                b bVar = this.f;
                File file = this.a;
                if (z || this.c != null) {
                    fileArr = this.c;
                    if (fileArr != null) {
                        i = this.d;
                        Intrinsics.checkNotNull(fileArr);
                        if (i < fileArr.length) {
                            File[] fileArr2 = this.c;
                            Intrinsics.checkNotNull(fileArr2);
                            int i2 = this.d;
                            this.d = i2 + 1;
                            return fileArr2[i2];
                        }
                    }
                    if (!this.b) {
                        this.b = true;
                        return file;
                    }
                    function1 = C4706jd0.this.d;
                    if (function1 != null) {
                        function1.invoke(file);
                    }
                } else {
                    Function1<File, Boolean> function2 = C4706jd0.this.c;
                    if (function2 == null || function2.invoke(file).booleanValue()) {
                        File[] fileArrListFiles = file.listFiles();
                        this.c = fileArrListFiles;
                        if (fileArrListFiles == null) {
                            Function2<File, IOException, Unit> function3 = C4706jd0.this.e;
                            if (function3 != null) {
                                function3.invoke(file, new N1(this.a, null, "Cannot list files in a directory", 2, null));
                            }
                            this.e = true;
                        }
                        fileArr = this.c;
                        if (fileArr != null) {
                            i = this.d;
                            Intrinsics.checkNotNull(fileArr);
                            if (i < fileArr.length) {
                                File[] fileArr3 = this.c;
                                Intrinsics.checkNotNull(fileArr3);
                                int i3 = this.d;
                                this.d = i3 + 1;
                                return fileArr3[i3];
                            }
                        }
                        if (!this.b) {
                            this.b = true;
                            return file;
                        }
                        function1 = C4706jd0.this.d;
                        if (function1 != null) {
                            function1.invoke(file);
                        }
                    }
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: jd0$b$b, reason: collision with other inner class name */
        public final class C0419b extends c {
            public boolean b;

            @Override // defpackage.C4706jd0.c
            @Nullable
            public final File a() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return this.a;
            }
        }

        /* JADX INFO: renamed from: jd0$b$c */
        public final class c extends a {
            public boolean b;

            @Nullable
            public File[] c;
            public int d;
            public final /* synthetic */ b e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.e = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0037  */
            /* JADX WARN: Code duplicated, block: B:22:0x003b  */
            /* JADX WARN: Code duplicated, block: B:29:0x005c  */
            /* JADX WARN: Code duplicated, block: B:33:0x0068  */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // defpackage.C4706jd0.c
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.io.File a() {
                /*
                    r10 = this;
                    boolean r0 = r10.b
                    r1 = 0
                    jd0$b r2 = r10.e
                    java.io.File r3 = r10.a
                    if (r0 != 0) goto L20
                    jd0 r0 = defpackage.C4706jd0.this
                    kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean> r0 = r0.c
                    if (r0 == 0) goto L1c
                    java.lang.Object r0 = r0.invoke(r3)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L1c
                    goto L6b
                L1c:
                    r0 = 1
                    r10.b = r0
                    return r3
                L20:
                    java.io.File[] r0 = r10.c
                    if (r0 == 0) goto L37
                    int r4 = r10.d
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r4 >= r0) goto L2d
                    goto L37
                L2d:
                    jd0 r0 = defpackage.C4706jd0.this
                    kotlin.jvm.functions.Function1<java.io.File, kotlin.Unit> r0 = r0.d
                    if (r0 == 0) goto L6b
                    r0.invoke(r3)
                    return r1
                L37:
                    java.io.File[] r0 = r10.c
                    if (r0 != 0) goto L6c
                    java.io.File[] r0 = r3.listFiles()
                    r10.c = r0
                    if (r0 != 0) goto L58
                    jd0 r0 = defpackage.C4706jd0.this
                    kotlin.jvm.functions.Function2<java.io.File, java.io.IOException, kotlin.Unit> r0 = r0.e
                    if (r0 == 0) goto L58
                    N1 r4 = new N1
                    r6 = 0
                    java.lang.String r7 = "Cannot list files in a directory"
                    java.io.File r5 = r10.a
                    r8 = 2
                    r9 = 0
                    r4.<init>(r5, r6, r7, r8, r9)
                    r0.invoke(r3, r4)
                L58:
                    java.io.File[] r0 = r10.c
                    if (r0 == 0) goto L62
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L6c
                L62:
                    jd0 r0 = defpackage.C4706jd0.this
                    kotlin.jvm.functions.Function1<java.io.File, kotlin.Unit> r0 = r0.d
                    if (r0 == 0) goto L6b
                    r0.invoke(r3)
                L6b:
                    return r1
                L6c:
                    java.io.File[] r0 = r10.c
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r1 = r10.d
                    int r2 = r1 + 1
                    r10.d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C4706jd0.b.c.a():java.io.File");
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.g = arrayDeque;
            if (C4706jd0.this.a.isDirectory()) {
                arrayDeque.push(c(C4706jd0.this.a));
            } else {
                if (!C4706jd0.this.a.isFile()) {
                    this.d = 2;
                    return;
                }
                File rootFile = C4706jd0.this.a;
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                arrayDeque.push(new C0419b(rootFile));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.AbstractC4785k0
        public final void b() {
            T t;
            while (true) {
                ArrayDeque<c> arrayDeque = this.g;
                c cVarPeek = arrayDeque.peek();
                if (cVarPeek == null) {
                    t = 0;
                    break;
                }
                File fileA = cVarPeek.a();
                if (fileA == null) {
                    arrayDeque.pop();
                } else {
                    if (fileA.equals(cVarPeek.a) || !fileA.isDirectory() || arrayDeque.size() >= C4706jd0.this.f) {
                        t = fileA;
                        break;
                    }
                    arrayDeque.push(c(fileA));
                }
            }
            if (t == 0) {
                this.d = 2;
            } else {
                this.e = t;
                this.d = 1;
            }
        }

        public final a c(File file) {
            int iOrdinal = C4706jd0.this.b.ordinal();
            if (iOrdinal == 0) {
                return new c(this, file);
            }
            if (iOrdinal == 1) {
                return new a(this, file);
            }
            throw new C6489s51();
        }
    }

    /* JADX INFO: renamed from: jd0$c */
    public static abstract class c {

        @NotNull
        public final File a;

        public c(@NotNull File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.a = root;
        }

        @Nullable
        public abstract File a();
    }

    public C4706jd0(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function2, Function2 function3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        fileWalkDirection = (i2 & 2) != 0 ? FileWalkDirection.d : fileWalkDirection;
        i = (i2 & 32) != 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i;
        this.a = file;
        this.b = fileWalkDirection;
        this.c = function1;
        this.d = function2;
        this.e = function3;
        this.f = i;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<File> iterator() {
        return new b();
    }
}
