package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.C2646a50;
import defpackage.C2870b50;
import io.sentry.android.core.b0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class DynamiteModule {

    @KeepForSdk
    public static final int LOCAL = -1;

    @KeepForSdk
    public static final int NONE = 0;

    @KeepForSdk
    public static final int NO_SELECTION = 0;

    @KeepForSdk
    public static final int REMOTE = 1;
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf;
    private static zzq zzk;
    private static zzr zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();

    @NonNull
    public static final VersionPolicy zza = new zzl();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }

    public interface VersionPolicy {

        @KeepForSdk
        public interface IVersions {
            int zza(@NonNull Context context, @NonNull String str);

            int zzb(@NonNull Context context, @NonNull String str, boolean z);
        }

        @KeepForSdk
        public static class SelectionResult {

            @KeepForSdk
            public int localVersion = 0;

            @KeepForSdk
            public int remoteVersion = 0;

            @KeepForSdk
            public int selection = 0;
        }

        @NonNull
        @KeepForSdk
        SelectionResult selectModule(@NonNull Context context, @NonNull String str, @NonNull IVersions iVersions);
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    @KeepForSdk
    public static int getLocalVersion(@NonNull Context context, @NonNull String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            b0.c("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            b0.e("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e) {
            b0.c("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(@NonNull Context context, @NonNull String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:114:0x01da  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f5 A[Catch: all -> 0x005f, TryCatch #8 {all -> 0x005f, blocks: (B:7:0x0033, B:17:0x0059, B:122:0x01f5, B:123:0x0207, B:99:0x0187, B:100:0x0192, B:106:0x019f, B:108:0x01bd, B:110:0x01cc, B:120:0x01ec, B:121:0x01f4, B:103:0x0195, B:104:0x0196, B:105:0x019e, B:124:0x0208, B:125:0x0233, B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00d0, B:58:0x00d8, B:60:0x00e0, B:61:0x00e9, B:55:0x00bd, B:64:0x00ec, B:65:0x00ed, B:66:0x00f5, B:67:0x00f6, B:68:0x00fe, B:71:0x0101, B:72:0x0102, B:74:0x0108, B:76:0x010f, B:78:0x0117, B:84:0x0150, B:86:0x0156, B:87:0x015f, B:88:0x0167, B:79:0x0126, B:80:0x012e, B:82:0x0131, B:83:0x0141, B:89:0x0168, B:90:0x0170, B:91:0x0171, B:92:0x0179, B:98:0x0186), top: B:147:0x0033, inners: #2, #8 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0059 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #8 {all -> 0x005f, blocks: (B:7:0x0033, B:17:0x0059, B:122:0x01f5, B:123:0x0207, B:99:0x0187, B:100:0x0192, B:106:0x019f, B:108:0x01bd, B:110:0x01cc, B:120:0x01ec, B:121:0x01f4, B:103:0x0195, B:104:0x0196, B:105:0x019e, B:124:0x0208, B:125:0x0233, B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00d0, B:58:0x00d8, B:60:0x00e0, B:61:0x00e9, B:55:0x00bd, B:64:0x00ec, B:65:0x00ed, B:66:0x00f5, B:67:0x00f6, B:68:0x00fe, B:71:0x0101, B:72:0x0102, B:74:0x0108, B:76:0x010f, B:78:0x0117, B:84:0x0150, B:86:0x0156, B:87:0x015f, B:88:0x0167, B:79:0x0126, B:80:0x012e, B:82:0x0131, B:83:0x0141, B:89:0x0168, B:90:0x0170, B:91:0x0171, B:92:0x0179, B:98:0x0186), top: B:147:0x0033, inners: #2, #8 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006d A[Catch: all -> 0x017a, TryCatch #4 {, blocks: (B:24:0x0067, B:26:0x006d, B:27:0x006f, B:95:0x017c, B:96:0x0184), top: B:144:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0072 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TRY_ENTER, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00d0, B:58:0x00d8, B:60:0x00e0, B:61:0x00e9, B:55:0x00bd, B:64:0x00ec, B:65:0x00ed, B:66:0x00f5, B:67:0x00f6, B:68:0x00fe, B:71:0x0101, B:72:0x0102, B:74:0x0108, B:76:0x010f, B:78:0x0117, B:84:0x0150, B:86:0x0156, B:87:0x015f, B:88:0x0167, B:79:0x0126, B:80:0x012e, B:82:0x0131, B:83:0x0141, B:89:0x0168, B:90:0x0170, B:91:0x0171, B:92:0x0179, B:98:0x0186), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:36:0x0081 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TRY_ENTER, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00d0, B:58:0x00d8, B:60:0x00e0, B:61:0x00e9, B:55:0x00bd, B:64:0x00ec, B:65:0x00ed, B:66:0x00f5, B:67:0x00f6, B:68:0x00fe, B:71:0x0101, B:72:0x0102, B:74:0x0108, B:76:0x010f, B:78:0x0117, B:84:0x0150, B:86:0x0156, B:87:0x015f, B:88:0x0167, B:79:0x0126, B:80:0x012e, B:82:0x0131, B:83:0x0141, B:89:0x0168, B:90:0x0170, B:91:0x0171, B:92:0x0179, B:98:0x0186), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f6 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00d0, B:58:0x00d8, B:60:0x00e0, B:61:0x00e9, B:55:0x00bd, B:64:0x00ec, B:65:0x00ed, B:66:0x00f5, B:67:0x00f6, B:68:0x00fe, B:71:0x0101, B:72:0x0102, B:74:0x0108, B:76:0x010f, B:78:0x0117, B:84:0x0150, B:86:0x0156, B:87:0x015f, B:88:0x0167, B:79:0x0126, B:80:0x012e, B:82:0x0131, B:83:0x0141, B:89:0x0168, B:90:0x0170, B:91:0x0171, B:92:0x0179, B:98:0x0186), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0102 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00d0, B:58:0x00d8, B:60:0x00e0, B:61:0x00e9, B:55:0x00bd, B:64:0x00ec, B:65:0x00ed, B:66:0x00f5, B:67:0x00f6, B:68:0x00fe, B:71:0x0101, B:72:0x0102, B:74:0x0108, B:76:0x010f, B:78:0x0117, B:84:0x0150, B:86:0x0156, B:87:0x015f, B:88:0x0167, B:79:0x0126, B:80:0x012e, B:82:0x0131, B:83:0x0141, B:89:0x0168, B:90:0x0170, B:91:0x0171, B:92:0x0179, B:98:0x0186), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0108 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00d0, B:58:0x00d8, B:60:0x00e0, B:61:0x00e9, B:55:0x00bd, B:64:0x00ec, B:65:0x00ed, B:66:0x00f5, B:67:0x00f6, B:68:0x00fe, B:71:0x0101, B:72:0x0102, B:74:0x0108, B:76:0x010f, B:78:0x0117, B:84:0x0150, B:86:0x0156, B:87:0x015f, B:88:0x0167, B:79:0x0126, B:80:0x012e, B:82:0x0131, B:83:0x0141, B:89:0x0168, B:90:0x0170, B:91:0x0171, B:92:0x0179, B:98:0x0186), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x010f A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00d0, B:58:0x00d8, B:60:0x00e0, B:61:0x00e9, B:55:0x00bd, B:64:0x00ec, B:65:0x00ed, B:66:0x00f5, B:67:0x00f6, B:68:0x00fe, B:71:0x0101, B:72:0x0102, B:74:0x0108, B:76:0x010f, B:78:0x0117, B:84:0x0150, B:86:0x0156, B:87:0x015f, B:88:0x0167, B:79:0x0126, B:80:0x012e, B:82:0x0131, B:83:0x0141, B:89:0x0168, B:90:0x0170, B:91:0x0171, B:92:0x0179, B:98:0x0186), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0117 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00d0, B:58:0x00d8, B:60:0x00e0, B:61:0x00e9, B:55:0x00bd, B:64:0x00ec, B:65:0x00ed, B:66:0x00f5, B:67:0x00f6, B:68:0x00fe, B:71:0x0101, B:72:0x0102, B:74:0x0108, B:76:0x010f, B:78:0x0117, B:84:0x0150, B:86:0x0156, B:87:0x015f, B:88:0x0167, B:79:0x0126, B:80:0x012e, B:82:0x0131, B:83:0x0141, B:89:0x0168, B:90:0x0170, B:91:0x0171, B:92:0x0179, B:98:0x0186), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0126 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00d0, B:58:0x00d8, B:60:0x00e0, B:61:0x00e9, B:55:0x00bd, B:64:0x00ec, B:65:0x00ed, B:66:0x00f5, B:67:0x00f6, B:68:0x00fe, B:71:0x0101, B:72:0x0102, B:74:0x0108, B:76:0x010f, B:78:0x0117, B:84:0x0150, B:86:0x0156, B:87:0x015f, B:88:0x0167, B:79:0x0126, B:80:0x012e, B:82:0x0131, B:83:0x0141, B:89:0x0168, B:90:0x0170, B:91:0x0171, B:92:0x0179, B:98:0x0186), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0131 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00d0, B:58:0x00d8, B:60:0x00e0, B:61:0x00e9, B:55:0x00bd, B:64:0x00ec, B:65:0x00ed, B:66:0x00f5, B:67:0x00f6, B:68:0x00fe, B:71:0x0101, B:72:0x0102, B:74:0x0108, B:76:0x010f, B:78:0x0117, B:84:0x0150, B:86:0x0156, B:87:0x015f, B:88:0x0167, B:79:0x0126, B:80:0x012e, B:82:0x0131, B:83:0x0141, B:89:0x0168, B:90:0x0170, B:91:0x0171, B:92:0x0179, B:98:0x0186), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0141 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00d0, B:58:0x00d8, B:60:0x00e0, B:61:0x00e9, B:55:0x00bd, B:64:0x00ec, B:65:0x00ed, B:66:0x00f5, B:67:0x00f6, B:68:0x00fe, B:71:0x0101, B:72:0x0102, B:74:0x0108, B:76:0x010f, B:78:0x0117, B:84:0x0150, B:86:0x0156, B:87:0x015f, B:88:0x0167, B:79:0x0126, B:80:0x012e, B:82:0x0131, B:83:0x0141, B:89:0x0168, B:90:0x0170, B:91:0x0171, B:92:0x0179, B:98:0x0186), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0156 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00d0, B:58:0x00d8, B:60:0x00e0, B:61:0x00e9, B:55:0x00bd, B:64:0x00ec, B:65:0x00ed, B:66:0x00f5, B:67:0x00f6, B:68:0x00fe, B:71:0x0101, B:72:0x0102, B:74:0x0108, B:76:0x010f, B:78:0x0117, B:84:0x0150, B:86:0x0156, B:87:0x015f, B:88:0x0167, B:79:0x0126, B:80:0x012e, B:82:0x0131, B:83:0x0141, B:89:0x0168, B:90:0x0170, B:91:0x0171, B:92:0x0179, B:98:0x0186), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x015f A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00d0, B:58:0x00d8, B:60:0x00e0, B:61:0x00e9, B:55:0x00bd, B:64:0x00ec, B:65:0x00ed, B:66:0x00f5, B:67:0x00f6, B:68:0x00fe, B:71:0x0101, B:72:0x0102, B:74:0x0108, B:76:0x010f, B:78:0x0117, B:84:0x0150, B:86:0x0156, B:87:0x015f, B:88:0x0167, B:79:0x0126, B:80:0x012e, B:82:0x0131, B:83:0x0141, B:89:0x0168, B:90:0x0170, B:91:0x0171, B:92:0x0179, B:98:0x0186), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0168 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00d0, B:58:0x00d8, B:60:0x00e0, B:61:0x00e9, B:55:0x00bd, B:64:0x00ec, B:65:0x00ed, B:66:0x00f5, B:67:0x00f6, B:68:0x00fe, B:71:0x0101, B:72:0x0102, B:74:0x0108, B:76:0x010f, B:78:0x0117, B:84:0x0150, B:86:0x0156, B:87:0x015f, B:88:0x0167, B:79:0x0126, B:80:0x012e, B:82:0x0131, B:83:0x0141, B:89:0x0168, B:90:0x0170, B:91:0x0171, B:92:0x0179, B:98:0x0186), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0171 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00d0, B:58:0x00d8, B:60:0x00e0, B:61:0x00e9, B:55:0x00bd, B:64:0x00ec, B:65:0x00ed, B:66:0x00f5, B:67:0x00f6, B:68:0x00fe, B:71:0x0101, B:72:0x0102, B:74:0x0108, B:76:0x010f, B:78:0x0117, B:84:0x0150, B:86:0x0156, B:87:0x015f, B:88:0x0167, B:79:0x0126, B:80:0x012e, B:82:0x0131, B:83:0x0141, B:89:0x0168, B:90:0x0170, B:91:0x0171, B:92:0x0179, B:98:0x0186), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x017c A[Catch: all -> 0x017a, TRY_ENTER, TryCatch #4 {, blocks: (B:24:0x0067, B:26:0x006d, B:27:0x006f, B:95:0x017c, B:96:0x0184), top: B:144:0x0067 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:122:0x01f5, please report this as an issue */
    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static DynamiteModule load(@NonNull Context context, @NonNull VersionPolicy versionPolicy, @NonNull String str) throws Throwable {
        long j;
        DynamiteModule dynamiteModuleZzc;
        Boolean bool;
        zzq zzqVarZzg;
        int iZze;
        IObjectWrapper iObjectWrapperZzh;
        Object objUnwrap;
        DynamiteModule dynamiteModule;
        zzn zznVar;
        zzr zzrVar;
        zzn zznVar2;
        boolean z;
        IObjectWrapper iObjectWrapperZze;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        zzp zzpVar = null;
        if (applicationContext == null) {
            throw new LoadingException("null application Context", null);
        }
        ThreadLocal threadLocal = zzg;
        zzn zznVar3 = (zzn) threadLocal.get();
        zzn zznVar4 = new zzn(null);
        threadLocal.set(zznVar4);
        ThreadLocal threadLocal2 = zzh;
        Long l = (Long) threadLocal2.get();
        long jLongValue = l.longValue();
        try {
            j = 0;
            try {
                threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
                VersionPolicy.SelectionResult selectionResultSelectModule = versionPolicy.selectModule(context, str, zzi);
                int i = selectionResultSelectModule.localVersion;
                int i2 = selectionResultSelectModule.remoteVersion;
                int i3 = selectionResultSelectModule.selection;
                if (i3 != 0) {
                    if (i3 != -1) {
                        if (i3 == 1 || i2 != 0) {
                            if (i3 == -1) {
                                dynamiteModuleZzc = zzc(applicationContext, str);
                            } else {
                                try {
                                    if (i3 == 1) {
                                        throw new LoadingException("VersionPolicy returned invalid code:" + i3, null);
                                    }
                                    try {
                                        synchronized (DynamiteModule.class) {
                                            if (zzf(context)) {
                                                throw new LoadingException("Remote loading disabled", null);
                                            }
                                            bool = zzb;
                                        }
                                        if (bool != null) {
                                            throw new LoadingException("Failed to determine which loading route to use.", null);
                                        }
                                        if (bool.booleanValue()) {
                                            synchronized (DynamiteModule.class) {
                                                zzrVar = zzl;
                                            }
                                            if (zzrVar != null) {
                                                throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                            }
                                            zznVar2 = (zzn) threadLocal.get();
                                            if (zznVar2 != null || zznVar2.zza == null) {
                                                throw new LoadingException("No result cursor", null);
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = zznVar2.zza;
                                            ObjectWrapper.wrap(null);
                                            synchronized (DynamiteModule.class) {
                                                z = zze >= 2;
                                            }
                                            if (z) {
                                                iObjectWrapperZze = zzrVar.zzf(ObjectWrapper.wrap(applicationContext2), str, i2, ObjectWrapper.wrap(cursor2));
                                            } else {
                                                b0.e("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                iObjectWrapperZze = zzrVar.zze(ObjectWrapper.wrap(applicationContext2), str, i2, ObjectWrapper.wrap(cursor2));
                                            }
                                            Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapperZze);
                                            if (context2 == null) {
                                                throw new LoadingException("Failed to get module context", zzpVar);
                                            }
                                            dynamiteModule = new DynamiteModule(context2);
                                        } else {
                                            zzqVarZzg = zzg(context);
                                            if (zzqVarZzg != null) {
                                                throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                            }
                                            iZze = zzqVarZzg.zze();
                                            if (iZze >= 3) {
                                                zznVar = (zzn) threadLocal.get();
                                                if (zznVar != null) {
                                                    throw new LoadingException("No cached result cursor holder", null);
                                                }
                                                iObjectWrapperZzh = zzqVarZzg.zzi(ObjectWrapper.wrap(context), str, i2, ObjectWrapper.wrap(zznVar.zza));
                                            } else if (iZze == 2) {
                                                b0.e("DynamiteModule", "IDynamite loader version = 2");
                                                iObjectWrapperZzh = zzqVarZzg.zzj(ObjectWrapper.wrap(context), str, i2);
                                            } else {
                                                b0.e("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                iObjectWrapperZzh = zzqVarZzg.zzh(ObjectWrapper.wrap(context), str, i2);
                                            }
                                            objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                                            if (objUnwrap != null) {
                                                throw new LoadingException("Failed to load remote module.", null);
                                            }
                                            dynamiteModule = new DynamiteModule((Context) objUnwrap);
                                        }
                                        dynamiteModuleZzc = dynamiteModule;
                                    } catch (RemoteException e) {
                                        throw new LoadingException("Failed to load remote module.", e, null);
                                    } catch (LoadingException e2) {
                                        throw e2;
                                    } catch (Throwable th) {
                                        CrashUtils.addDynamiteErrorToDropBox(context, th);
                                        throw new LoadingException("Failed to load remote module.", th, null);
                                    }
                                } catch (LoadingException e3) {
                                    b0.e("DynamiteModule", "Failed to load remote module: " + e3.getMessage());
                                    int i4 = selectionResultSelectModule.localVersion;
                                    if (i4 == 0 || versionPolicy.selectModule(context, str, new zzo(i4, 0)).selection != -1) {
                                        throw new LoadingException("Remote load failed. No local fallback found.", e3, null);
                                    }
                                    dynamiteModuleZzc = zzc(applicationContext, str);
                                }
                            }
                            if (jLongValue == 0) {
                                zzh.remove();
                            } else {
                                zzh.set(l);
                            }
                            cursor = zznVar4.zza;
                            if (cursor != null) {
                                cursor.close();
                            }
                            zzg.set(zznVar3);
                            return dynamiteModuleZzc;
                        }
                    } else if (i != 0) {
                        i3 = -1;
                        if (i3 == 1) {
                        }
                        if (i3 == -1) {
                            dynamiteModuleZzc = zzc(applicationContext, str);
                        } else {
                            if (i3 == 1) {
                                throw new LoadingException("VersionPolicy returned invalid code:" + i3, null);
                            }
                            synchronized (DynamiteModule.class) {
                                if (zzf(context)) {
                                    throw new LoadingException("Remote loading disabled", null);
                                }
                                bool = zzb;
                                if (bool != null) {
                                    throw new LoadingException("Failed to determine which loading route to use.", null);
                                }
                                if (bool.booleanValue()) {
                                    synchronized (DynamiteModule.class) {
                                        zzrVar = zzl;
                                        if (zzrVar != null) {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        zznVar2 = (zzn) threadLocal.get();
                                        if (zznVar2 != null) {
                                        }
                                        throw new LoadingException("No result cursor", null);
                                    }
                                }
                                zzqVarZzg = zzg(context);
                                if (zzqVarZzg != null) {
                                    throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                }
                                iZze = zzqVarZzg.zze();
                                if (iZze >= 3) {
                                    zznVar = (zzn) threadLocal.get();
                                    if (zznVar != null) {
                                        throw new LoadingException("No cached result cursor holder", null);
                                    }
                                    iObjectWrapperZzh = zzqVarZzg.zzi(ObjectWrapper.wrap(context), str, i2, ObjectWrapper.wrap(zznVar.zza));
                                } else if (iZze == 2) {
                                    b0.e("DynamiteModule", "IDynamite loader version = 2");
                                    iObjectWrapperZzh = zzqVarZzg.zzj(ObjectWrapper.wrap(context), str, i2);
                                } else {
                                    b0.e("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    iObjectWrapperZzh = zzqVarZzg.zzh(ObjectWrapper.wrap(context), str, i2);
                                }
                                objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                                if (objUnwrap != null) {
                                    throw new LoadingException("Failed to load remote module.", null);
                                }
                                dynamiteModule = new DynamiteModule((Context) objUnwrap);
                                dynamiteModuleZzc = dynamiteModule;
                            }
                        }
                        if (jLongValue == 0) {
                            zzh.remove();
                        } else {
                            zzh.set(l);
                        }
                        cursor = zznVar4.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        zzg.set(zznVar3);
                        return dynamiteModuleZzc;
                    }
                }
                throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectionResultSelectModule.localVersion + " and remote version is " + selectionResultSelectModule.remoteVersion + ".", null);
            } catch (Throwable th2) {
                th = th2;
                if (jLongValue == j) {
                    zzh.remove();
                } else {
                    zzh.set(l);
                }
                Cursor cursor3 = zznVar4.zza;
                if (cursor3 != null) {
                    cursor3.close();
                }
                zzg.set(zznVar3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j = 0;
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:138:0x01cc */
    /* JADX WARN: Code duplicated, block: B:106:0x017d A[Catch: all -> 0x00ec, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00ec, blocks: (B:3:0x0002, B:64:0x00e1, B:66:0x00e7, B:74:0x010d, B:102:0x016f, B:106:0x017d, B:124:0x01d2, B:125:0x01d5, B:119:0x01c9, B:72:0x00f2, B:127:0x01d7, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00de, B:21:0x0049, B:45:0x00a1, B:48:0x00a4, B:55:0x00bc, B:63:0x00e0, B:61:0x00c2), top: B:134:0x0002, inners: #5, #11 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b0 A[Catch: all -> 0x0036, TryCatch #10 {all -> 0x0036, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b9, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004f, B:27:0x0053, B:31:0x005d, B:33:0x0065, B:36:0x006c, B:43:0x0098, B:44:0x00a0, B:39:0x0073, B:41:0x0079, B:42:0x008a, B:47:0x00a3, B:50:0x00a6, B:51:0x00b0, B:17:0x003e), top: B:141:0x0026, inners: #12 }] */
    public static int zza(@NonNull Context context, @NonNull String str, boolean z) {
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzb;
                Cursor cursor2 = null;
                int iZzf = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        zzd(classLoader);
                                    } catch (LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!zzf(context)) {
                                        return 0;
                                    }
                                    if (zzd) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iZzb = zzb(context, str, z, true);
                                                String str2 = zzc;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderZza = zzb.zza();
                                                    if (classLoaderZza == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            C2870b50.a();
                                                            String str3 = zzc;
                                                            Preconditions.checkNotNull(str3);
                                                            classLoaderZza = C2646a50.a(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = zzc;
                                                            Preconditions.checkNotNull(str4);
                                                            classLoaderZza = new zzc(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    zzd(classLoaderZza);
                                                    declaredField.set(null, classLoaderZza);
                                                    zzb = bool2;
                                                    return iZzb;
                                                }
                                                return iZzb;
                                            } catch (LoadingException unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                zzb = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                        b0.e("DynamiteModule", "Failed to load module via V2: " + e.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzb(context, str, z, false);
                    } catch (LoadingException e2) {
                        b0.e("DynamiteModule", "Failed to retrieve remote module version: " + e2.getMessage());
                        return 0;
                    }
                }
                zzq zzqVarZzg = zzg(context);
                try {
                    if (zzqVarZzg != null) {
                        try {
                            int iZze = zzqVarZzg.zze();
                            if (iZze >= 3) {
                                zzn zznVar = (zzn) zzg.get();
                                if (zznVar == null || (cursor = zznVar.zza) == null) {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(zzqVarZzg.zzk(ObjectWrapper.wrap(context), str, z, ((Long) zzh.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i = cursor3.getInt(0);
                                                cursor2 = (i <= 0 || !zze(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iZzf = i;
                                            } else {
                                                b0.e("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                            }
                                        } catch (RemoteException e3) {
                                            remoteException = e3;
                                            cursor2 = cursor3;
                                            b0.e("DynamiteModule", "Failed to retrieve remote module version: " + remoteException.getMessage());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor2 = cursor3;
                                            if (cursor2 == null) {
                                                throw th;
                                            }
                                            cursor2.close();
                                            throw th;
                                        }
                                    } else {
                                        b0.e("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } else {
                                    iZzf = cursor.getInt(0);
                                }
                            } else if (iZze == 2) {
                                b0.e("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iZzf = zzqVarZzg.zzg(ObjectWrapper.wrap(context), str, z);
                            } else {
                                b0.e("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iZzf = zzqVarZzg.zzf(ObjectWrapper.wrap(context), str, z);
                            }
                        } catch (RemoteException e4) {
                            remoteException = e4;
                        }
                    }
                    return iZzf;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            CrashUtils.addDynamiteErrorToDropBox(context, th5);
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    private static int zzb(Context context, String str, boolean z, boolean z2) throws Throwable {
        Throwable th;
        Exception exc;
        ?? r1 = 0;
        ?? r2 = 0;
        ?? r3 = 0;
        ?? r4 = 0;
        try {
            try {
                boolean z3 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) zzh.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z4 = false;
                            int i = cursorQuery.getInt(0);
                            if (i > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        zzc = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            zze = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (cursorQuery.getInt(columnIndex2) == 0) {
                                                z3 = false;
                                            }
                                            zzd = z3;
                                            z4 = z3;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                if (zze(cursorQuery)) {
                                    cursorQuery = null;
                                }
                            }
                            if (z2 && z4) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", r3 == true ? 1 : 0);
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i;
                        }
                    } catch (Exception e) {
                        exc = e;
                        if (exc instanceof LoadingException) {
                            throw exc;
                        }
                        throw new LoadingException("V2 version check failed: " + exc.getMessage(), exc, r2 == true ? 1 : 0);
                    }
                }
                b0.e("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", r4 == true ? 1 : 0);
            } catch (Throwable th3) {
                th = th3;
                r1 = context;
                if (r1 != 0) {
                    throw th;
                }
                r1.close();
                throw th;
            }
        } catch (Exception e2) {
            exc = e2;
        } catch (Throwable th4) {
            th = th4;
            if (r1 != 0) {
                throw th;
            }
            r1.close();
            throw th;
        }
    }

    private static DynamiteModule zzc(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context);
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        zzp zzpVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzrVar = iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzr(iBinder);
            }
            zzl = zzrVar;
        } catch (ClassNotFoundException e) {
            e = e;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (InstantiationException e3) {
            e = e3;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (NoSuchMethodException e4) {
            e = e4;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zznVar = (zzn) zzg.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    private static boolean zzf(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzf)) {
            return true;
        }
        boolean z = false;
        if (zzf == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            zzf = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                zzd = true;
            }
        }
        if (!z) {
            b0.c("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    private static zzq zzg(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = zzk;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
                }
                if (zzqVar != null) {
                    zzk = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e) {
                b0.c("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
            return null;
        }
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @NonNull
    @KeepForSdk
    public IBinder instantiate(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, null);
        }
    }
}
