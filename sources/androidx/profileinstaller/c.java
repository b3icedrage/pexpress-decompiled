package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.C6049q00;
import defpackage.C6829ti1;
import defpackage.QO;
import io.sentry.android.core.b0;
import io.sentry.instrumentation.file.f;
import io.sentry.instrumentation.file.j;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final a a = new a();

    public class b implements InterfaceC0237c {
        @Override // androidx.profileinstaller.c.InterfaceC0237c
        public final void a(int i, Serializable serializable) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i == 6 || i == 7 || i == 8) {
                b0.d("ProfileInstaller", str, (Throwable) serializable);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$c, reason: collision with other inner class name */
    public interface InterfaceC0237c {
        void a(int i, Serializable serializable);
    }

    public static void a(@NonNull PackageInfo packageInfo, @NonNull File file) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(j.a.b(new FileOutputStream(file2), file2));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0168 A[Catch: all -> 0x0165, TRY_ENTER, TryCatch #2 {all -> 0x0165, blocks: (B:93:0x0144, B:95:0x0150, B:106:0x0168, B:107:0x016d), top: B:225:0x0144 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0179 A[Catch: IllegalStateException -> 0x015f, IOException -> 0x0161, FileNotFoundException -> 0x0163, TRY_LEAVE, TryCatch #27 {FileNotFoundException -> 0x0163, IOException -> 0x0161, IllegalStateException -> 0x015f, blocks: (B:91:0x013c, B:96:0x015a, B:114:0x0179, B:112:0x0176, B:111:0x0173), top: B:263:0x013c }] */
    /* JADX WARN: Code duplicated, block: B:121:0x018f  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b2 A[Catch: all -> 0x01c0, TRY_LEAVE, TryCatch #25 {all -> 0x01c0, blocks: (B:130:0x01a6, B:132:0x01b2, B:141:0x01c3), top: B:246:0x01a6, outer: #30 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x01c3 A[Catch: all -> 0x01c0, TRY_ENTER, TRY_LEAVE, TryCatch #25 {all -> 0x01c0, blocks: (B:130:0x01a6, B:132:0x01b2, B:141:0x01c3), top: B:246:0x01a6, outer: #30 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:156:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:165:0x020c A[Catch: all -> 0x022e, TRY_LEAVE, TryCatch #11 {all -> 0x022e, blocks: (B:162:0x0204, B:163:0x0206, B:165:0x020c), top: B:228:0x0204 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x025b  */
    /* JADX WARN: Code duplicated, block: B:210:0x0265  */
    /* JADX WARN: Code duplicated, block: B:215:0x0272 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x0276  */
    /* JADX WARN: Code duplicated, block: B:225:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x01f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x01a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0150 A[Catch: all -> 0x0165, TRY_LEAVE, TryCatch #2 {all -> 0x0165, blocks: (B:93:0x0144, B:95:0x0150, B:106:0x0168, B:107:0x016d), top: B:225:0x0144 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v3, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static void b(@NonNull Context context, @NonNull Executor executor, @NonNull InterfaceC0237c interfaceC0237c, boolean z) {
        boolean z2;
        ?? r7;
        FileInputStream fileInputStreamA;
        C6049q00[] c6049q00ArrG;
        InterfaceC0237c interfaceC0237c2;
        C6049q00[] c6049q00Arr;
        byte[] bArr;
        ?? r8;
        boolean z3;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStreamB;
        Throwable th;
        byte[] bArr2;
        int i;
        ?? r9;
        boolean z4;
        byte[] bArr3;
        ?? byteArrayOutputStream;
        int i2;
        androidx.profileinstaller.b bVar;
        FileInputStream fileInputStreamA2;
        ?? r10;
        ?? r11;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(f.a.a(file, new FileInputStream(file)));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j == packageInfo.lastUpdateTime;
                            if (z5) {
                                interfaceC0237c.a(2, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    context.getPackageName();
                    d.c(context, false);
                    return;
                }
            }
            context.getPackageName();
            int i3 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            androidx.profileinstaller.b bVar2 = new androidx.profileinstaller.b(assets, executor, interfaceC0237c, name, file2);
            byte[] bArr4 = bVar2.c;
            if (bArr4 != null) {
                try {
                    try {
                        try {
                            if (file2.exists()) {
                                if (!file2.canWrite()) {
                                    bVar2.b(4, null);
                                }
                                if (z4 || !z) {
                                    r11 = 0;
                                } else {
                                    r11 = r10;
                                }
                                d.c(context, r11);
                            }
                            try {
                                file2.createNewFile();
                            } catch (IOException unused2) {
                                z2 = true;
                                bVar2.b(4, null);
                                z4 = false;
                                r10 = z2;
                            }
                            fileInputStreamA = bVar2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e) {
                            interfaceC0237c.a(6, e);
                            fileInputStreamA = null;
                        } catch (IOException e2) {
                            interfaceC0237c.a(7, e2);
                            fileInputStreamA = null;
                        }
                        if (fileInputStreamA != null) {
                            try {
                                if (!Arrays.equals((byte[]) r7, QO.l(fileInputStreamA, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                c6049q00ArrG = C6829ti1.g(fileInputStreamA, QO.l(fileInputStreamA, 4), bVar2.e);
                                try {
                                    fileInputStreamA.close();
                                } catch (IOException e3) {
                                    interfaceC0237c.a(7, e3);
                                }
                                bVar2.g = c6049q00ArrG;
                            } catch (IOException e4) {
                                interfaceC0237c.a(7, e4);
                                fileInputStreamA.close();
                                c6049q00ArrG = null;
                            } catch (IllegalStateException e5) {
                                interfaceC0237c.a(8, e5);
                                fileInputStreamA.close();
                                c6049q00ArrG = null;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            fileInputStreamA.close();
                            throw th4;
                        } catch (IOException e6) {
                            interfaceC0237c.a(7, e6);
                            throw th4;
                        }
                    }
                } catch (IOException e7) {
                    interfaceC0237c.a(7, e7);
                }
                bVar2.f = true;
                r7 = C6829ti1.a;
                C6049q00[] c6049q00Arr2 = bVar2.g;
                if (c6049q00Arr2 != null && (i2 = Build.VERSION.SDK_INT) <= 34) {
                    if (i2 == 24 || i2 == 25) {
                        try {
                            fileInputStreamA2 = bVar2.a(assets, "dexopt/baseline.profm");
                            if (fileInputStreamA2 == null) {
                                try {
                                    if (Arrays.equals(C6829ti1.b, QO.l(fileInputStreamA2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    bVar2.g = C6829ti1.d(fileInputStreamA2, QO.l(fileInputStreamA2, 4), bArr4, c6049q00Arr2);
                                    fileInputStreamA2.close();
                                    bVar = bVar2;
                                } catch (Throwable th5) {
                                    try {
                                        fileInputStreamA2.close();
                                        throw th5;
                                    } catch (Throwable th6) {
                                        th5.addSuppressed(th6);
                                        throw th5;
                                    }
                                }
                            } else {
                                if (fileInputStreamA2 != null) {
                                    fileInputStreamA2.close();
                                }
                                bVar = null;
                            }
                        } catch (FileNotFoundException e8) {
                            interfaceC0237c.a(9, e8);
                        } catch (IOException e9) {
                            interfaceC0237c.a(7, e9);
                        } catch (IllegalStateException e10) {
                            bVar2.g = null;
                            interfaceC0237c.a(8, e10);
                        }
                        if (bVar != null) {
                            bVar2 = bVar;
                        }
                    } else {
                        switch (i2) {
                            case 31:
                            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                            case 33:
                            case 34:
                                fileInputStreamA2 = bVar2.a(assets, "dexopt/baseline.profm");
                                if (fileInputStreamA2 == null) {
                                    if (fileInputStreamA2 != null) {
                                        fileInputStreamA2.close();
                                    }
                                    bVar = null;
                                } else {
                                    if (Arrays.equals(C6829ti1.b, QO.l(fileInputStreamA2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    bVar2.g = C6829ti1.d(fileInputStreamA2, QO.l(fileInputStreamA2, 4), bArr4, c6049q00Arr2);
                                    fileInputStreamA2.close();
                                    bVar = bVar2;
                                }
                                if (bVar != null) {
                                    bVar2 = bVar;
                                    break;
                                }
                            default:
                                interfaceC0237c2 = bVar2.b;
                                c6049q00Arr = bVar2.g;
                                if (c6049q00Arr != null && (bArr3 = bVar2.c) != null) {
                                    if (bVar2.f) {
                                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    }
                                    try {
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            byteArrayOutputStream.write(r7);
                                            byteArrayOutputStream.write(bArr3);
                                            if (C6829ti1.i(byteArrayOutputStream, bArr3, c6049q00Arr)) {
                                                bVar2.h = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                bVar2.g = null;
                                            } else {
                                                interfaceC0237c2.a(5, null);
                                                bVar2.g = null;
                                                byteArrayOutputStream.close();
                                            }
                                        } catch (Throwable th7) {
                                            try {
                                                byteArrayOutputStream.close();
                                                throw th7;
                                            } catch (Throwable th8) {
                                                th7.addSuppressed(th8);
                                                throw th7;
                                            }
                                        }
                                    } catch (IOException e11) {
                                        interfaceC0237c2.a(7, e11);
                                    } catch (IllegalStateException e12) {
                                        interfaceC0237c2.a(8, e12);
                                    }
                                }
                                bArr = bVar2.h;
                                if (bArr != null) {
                                    z3 = false;
                                    r9 = 1;
                                } else {
                                    try {
                                        if (bVar2.f) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            try {
                                                byteArrayInputStream = new ByteArrayInputStream(bArr);
                                                try {
                                                    File file3 = bVar2.d;
                                                    fileOutputStreamB = j.a.b(new FileOutputStream(file3), file3);
                                                    try {
                                                        try {
                                                            bArr2 = new byte[UserVerificationMethods.USER_VERIFY_NONE];
                                                            while (true) {
                                                                i = byteArrayInputStream.read(bArr2);
                                                                if (i > 0) {
                                                                    fileOutputStreamB.write(bArr2, 0, i);
                                                                } else {
                                                                    r9 = 1;
                                                                    try {
                                                                        bVar2.b(1, null);
                                                                        fileOutputStreamB.close();
                                                                        byteArrayInputStream.close();
                                                                        bVar2.h = null;
                                                                        bVar2.g = null;
                                                                        z3 = true;
                                                                    } catch (Throwable th9) {
                                                                        th = th9;
                                                                    }
                                                                }
                                                                th = th;
                                                                try {
                                                                    fileOutputStreamB.close();
                                                                    throw th;
                                                                } catch (Throwable th10) {
                                                                    th.addSuppressed(th10);
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                            Throwable th12 = th;
                                                            try {
                                                                byteArrayInputStream.close();
                                                                throw th12;
                                                            } catch (Throwable th13) {
                                                                th12.addSuppressed(th13);
                                                                throw th12;
                                                            }
                                                        }
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                    }
                                                } catch (Throwable th15) {
                                                    th = th15;
                                                }
                                            } catch (FileNotFoundException e13) {
                                                e = e13;
                                                bVar2.b(6, e);
                                                r8 = r7;
                                                bVar2.h = null;
                                                bVar2.g = null;
                                                z3 = false;
                                                r9 = r8;
                                            } catch (IOException e14) {
                                                e = e14;
                                                bVar2.b(7, e);
                                                r8 = r7;
                                                bVar2.h = null;
                                                bVar2.g = null;
                                                z3 = false;
                                                r9 = r8;
                                            }
                                        } catch (FileNotFoundException e15) {
                                            e = e15;
                                            r7 = 1;
                                            bVar2.b(6, e);
                                            r8 = r7;
                                            bVar2.h = null;
                                            bVar2.g = null;
                                            z3 = false;
                                            r9 = r8;
                                        } catch (IOException e16) {
                                            e = e16;
                                            r7 = 1;
                                            bVar2.b(7, e);
                                            r8 = r7;
                                            bVar2.h = null;
                                            bVar2.g = null;
                                            z3 = false;
                                            r9 = r8;
                                        }
                                    } catch (Throwable th16) {
                                        bVar2.h = null;
                                        bVar2.g = null;
                                        throw th16;
                                    }
                                }
                                if (z3) {
                                    a(packageInfo, filesDir);
                                }
                                z4 = z3;
                                r10 = r9;
                                if (z4) {
                                    r11 = 0;
                                } else {
                                    r11 = 0;
                                }
                                d.c(context, r11);
                        }
                    }
                }
                interfaceC0237c2 = bVar2.b;
                c6049q00Arr = bVar2.g;
                if (c6049q00Arr != null) {
                    if (bVar2.f) {
                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                    }
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    byteArrayOutputStream.write(r7);
                    byteArrayOutputStream.write(bArr3);
                    if (C6829ti1.i(byteArrayOutputStream, bArr3, c6049q00Arr)) {
                        interfaceC0237c2.a(5, null);
                        bVar2.g = null;
                        byteArrayOutputStream.close();
                    } else {
                        bVar2.h = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        bVar2.g = null;
                    }
                }
                bArr = bVar2.h;
                if (bArr != null) {
                    if (bVar2.f) {
                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                    }
                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                    File file4 = bVar2.d;
                    fileOutputStreamB = j.a.b(new FileOutputStream(file4), file4);
                    bArr2 = new byte[UserVerificationMethods.USER_VERIFY_NONE];
                    while (true) {
                        i = byteArrayInputStream.read(bArr2);
                        if (i > 0) {
                            fileOutputStreamB.write(bArr2, 0, i);
                        } else {
                            r9 = 1;
                            bVar2.b(1, null);
                            fileOutputStreamB.close();
                            byteArrayInputStream.close();
                            bVar2.h = null;
                            bVar2.g = null;
                            z3 = true;
                        }
                        th = th;
                        fileOutputStreamB.close();
                        throw th;
                    }
                }
                z3 = false;
                r9 = 1;
                if (z3) {
                    a(packageInfo, filesDir);
                }
                z4 = z3;
                r10 = r9;
                if (z4) {
                    r11 = 0;
                } else {
                    r11 = 0;
                }
                d.c(context, r11);
            }
            bVar2.b(3, Integer.valueOf(i3));
            z2 = true;
            z4 = false;
            r10 = z2;
            if (z4) {
                r11 = 0;
            } else {
                r11 = 0;
            }
            d.c(context, r11);
        } catch (PackageManager.NameNotFoundException e17) {
            interfaceC0237c.a(7, e17);
            d.c(context, false);
        }
    }

    public class a implements InterfaceC0237c {
        @Override // androidx.profileinstaller.c.InterfaceC0237c
        public final void a(int i, Serializable serializable) {
        }
    }
}
