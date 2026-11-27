package defpackage;

import android.content.SharedPreferences;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Wg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001BB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001e\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b!\u0010\"J+\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b$\u0010%J+\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b'\u0010(J7\u0010*\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010)2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010)H\u0016¢\u0006\u0004\b*\u0010+J)\u0010,\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b,\u0010-J)\u0010.\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b.\u0010/J)\u00100\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b0\u00101J)\u00102\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b2\u00103J/\u00104\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010)H\u0016¢\u0006\u0004\b4\u00105R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00106R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00107R.\u0010:\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e09088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006C"}, d2 = {"LWg1;", "Lsu0;", "LYu0;", "LWr0;", "_applicationService", "Lgv0;", "_time", "<init>", "(LWr0;Lgv0;)V", "", Payload.TYPE_STORE, "key", "Ljava/lang/Class;", "type", "", "defValue", "get", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "save", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "LwW;", "doWorkAsync", "()LwW;", "Landroid/content/SharedPreferences;", "getSharedPrefsByName", "(Ljava/lang/String;)Landroid/content/SharedPreferences;", "start", "()V", "getString", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "getBool", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "", "getInt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;", "", "getLong", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;", "", "getStringSet", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", "saveString", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "saveBool", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "saveInt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "saveLong", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "saveStringSet", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "LWr0;", "Lgv0;", "", "", "prefsToApply", "Ljava/util/Map;", "queueJob", "LwW;", "Lxf2;", "waiter", "Lxf2;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C2306Wg1 implements InterfaceC6659su0, InterfaceC2529Yu0 {
    private static final int WRITE_CALL_DELAY_TO_BUFFER_MS = 200;

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC4092gv0 _time;

    @NotNull
    private final Map<String, Map<String, Object>> prefsToApply;

    @Nullable
    private InterfaceC7414wW<Unit> queueJob;

    @NotNull
    private final C7659xf2 waiter;

    /* JADX INFO: renamed from: Wg1$b */
    @InterfaceC3368dU(c = "com.onesignal.core.internal.preferences.impl.PreferencesService$doWorkAsync$1", f = "PreferencesService.kt", l = {221, 225}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        long J$0;
        int label;

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C2306Wg1.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0045 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:7:0x000e, B:17:0x0031, B:18:0x003f, B:20:0x0045, B:22:0x0062, B:23:0x006c, B:24:0x0070, B:48:0x00d4, B:49:0x00d5, B:50:0x00da, B:51:0x00db, B:52:0x00dc, B:61:0x0100, B:14:0x001f, B:25:0x0071, B:26:0x0079, B:28:0x007f, B:30:0x008d, B:33:0x0095, B:35:0x0099, B:36:0x00a3, B:38:0x00a7, B:39:0x00b1, B:41:0x00b5, B:42:0x00bf, B:44:0x00c3, B:46:0x00cb, B:47:0x00cf), top: B:65:0x0006, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:28:0x007f A[Catch: all -> 0x0093, TryCatch #1 {all -> 0x0093, blocks: (B:25:0x0071, B:26:0x0079, B:28:0x007f, B:30:0x008d, B:33:0x0095, B:35:0x0099, B:36:0x00a3, B:38:0x00a7, B:39:0x00b1, B:41:0x00b5, B:42:0x00bf, B:44:0x00c3, B:46:0x00cb, B:47:0x00cf), top: B:67:0x0071, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:69:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:72:0x00ff A[EDGE_INSN: B:72:0x00ff->B:60:0x00ff BREAK  A[LOOP:0: B:17:0x0031->B:71:0x0031], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:74:? A[PHI: r4
          PHI (r4v2 long) = (r4v3 long), (r4v1 long), (r4v8 long), (r4v10 long) binds: [B:64:0x0111, B:62:0x010e, B:16:0x0024, B:7:0x000e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x006c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:77:0x0062 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x0095 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:83:0x00a3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:0x008d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:85:0x0099 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:86:0x00b1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x00a7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x00bf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x00b5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x00c9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x00c3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x00cb A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:94:0x0079 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x010e -> B:17:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:87:0x00a7
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.AbstractC7487wq
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 282
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C2306Wg1.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C2306Wg1(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC4092gv0 _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._applicationService = _applicationService;
        this._time = _time;
        this.prefsToApply = PW0.e(new Pair("OneSignal", new LinkedHashMap()), new Pair("GTPlayerPurchases", new LinkedHashMap()));
        this.waiter = new C7659xf2();
    }

    private final InterfaceC7414wW<Unit> doWorkAsync() {
        return C5189lv.e(C6215qm0.d, C6266r20.c, new b(null), 2);
    }

    private final Object get(String store, String key, Class<?> type, Object defValue) throws Exception {
        if (!this.prefsToApply.containsKey(store)) {
            throw new Exception(C5491nL.c("Store not found: ", store));
        }
        Map<String, Object> map = this.prefsToApply.get(store);
        Intrinsics.checkNotNull(map);
        Map<String, Object> map2 = map;
        synchronized (map2) {
            Object obj = map2.get(key);
            if (obj == null && !map2.containsKey(key)) {
                Unit unit = Unit.a;
                SharedPreferences sharedPrefsByName = getSharedPrefsByName(store);
                if (sharedPrefsByName != null) {
                    try {
                        if (Intrinsics.a(type, String.class)) {
                            return sharedPrefsByName.getString(key, (String) defValue);
                        }
                        if (Intrinsics.a(type, Boolean.TYPE)) {
                            Boolean bool = (Boolean) defValue;
                            return Boolean.valueOf(sharedPrefsByName.getBoolean(key, bool != null ? bool.booleanValue() : false));
                        }
                        if (Intrinsics.a(type, Integer.TYPE)) {
                            Integer num = (Integer) defValue;
                            return Integer.valueOf(sharedPrefsByName.getInt(key, num != null ? num.intValue() : 0));
                        }
                        if (Intrinsics.a(type, Long.TYPE)) {
                            Long l = (Long) defValue;
                            return Long.valueOf(sharedPrefsByName.getLong(key, l != null ? l.longValue() : 0L));
                        }
                        if (Intrinsics.a(type, Set.class)) {
                            return sharedPrefsByName.getStringSet(key, (Set) defValue);
                        }
                        return null;
                    } catch (Exception unused) {
                    }
                }
                if (Intrinsics.a(type, String.class)) {
                    return (String) defValue;
                }
                if (Intrinsics.a(type, Boolean.TYPE)) {
                    Boolean bool2 = (Boolean) defValue;
                    return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                }
                if (Intrinsics.a(type, Integer.TYPE)) {
                    Integer num2 = (Integer) defValue;
                    return Integer.valueOf(num2 != null ? num2.intValue() : 0);
                }
                if (Intrinsics.a(type, Long.TYPE)) {
                    Long l2 = (Long) defValue;
                    return Long.valueOf(l2 != null ? l2.longValue() : 0L);
                }
                if (Intrinsics.a(type, Set.class)) {
                    return (Set) defValue;
                }
                return null;
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized SharedPreferences getSharedPrefsByName(String store) {
        return this._applicationService.getAppContext().getSharedPreferences(store, 0);
    }

    private final void save(String store, String key, Object value) throws Exception {
        if (!this.prefsToApply.containsKey(store)) {
            throw new Exception(C5491nL.c("Store not found: ", store));
        }
        Map<String, Object> map = this.prefsToApply.get(store);
        Intrinsics.checkNotNull(map);
        Map<String, Object> map2 = map;
        synchronized (map2) {
            map2.put(key, value);
            Unit unit = Unit.a;
        }
        this.waiter.wake();
    }

    @Override // defpackage.InterfaceC6659su0
    @Nullable
    public Boolean getBool(@NotNull String store, @NotNull String key, @Nullable Boolean defValue) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Boolean) get(store, key, Boolean.TYPE, defValue);
    }

    @Override // defpackage.InterfaceC6659su0
    @Nullable
    public Integer getInt(@NotNull String store, @NotNull String key, @Nullable Integer defValue) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Integer) get(store, key, Integer.TYPE, defValue);
    }

    @Override // defpackage.InterfaceC6659su0
    @Nullable
    public Long getLong(@NotNull String store, @NotNull String key, @Nullable Long defValue) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Long) get(store, key, Long.TYPE, defValue);
    }

    @Override // defpackage.InterfaceC6659su0
    @Nullable
    public String getString(@NotNull String store, @NotNull String key, @Nullable String defValue) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        return (String) get(store, key, String.class, defValue);
    }

    @Override // defpackage.InterfaceC6659su0
    @Nullable
    public Set<String> getStringSet(@NotNull String store, @NotNull String key, @Nullable Set<String> defValue) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Set) get(store, key, Set.class, defValue);
    }

    @Override // defpackage.InterfaceC6659su0
    public void saveBool(@NotNull String store, @NotNull String key, @Nullable Boolean value) throws Exception {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        save(store, key, value);
    }

    @Override // defpackage.InterfaceC6659su0
    public void saveInt(@NotNull String store, @NotNull String key, @Nullable Integer value) throws Exception {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        save(store, key, value);
    }

    @Override // defpackage.InterfaceC6659su0
    public void saveLong(@NotNull String store, @NotNull String key, @Nullable Long value) throws Exception {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        save(store, key, value);
    }

    @Override // defpackage.InterfaceC6659su0
    public void saveString(@NotNull String store, @NotNull String key, @Nullable String value) throws Exception {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        save(store, key, value);
    }

    @Override // defpackage.InterfaceC6659su0
    public void saveStringSet(@NotNull String store, @NotNull String key, @Nullable Set<String> value) throws Exception {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        save(store, key, value);
    }

    @Override // defpackage.InterfaceC2529Yu0
    public void start() {
        this.queueJob = doWorkAsync();
    }
}
