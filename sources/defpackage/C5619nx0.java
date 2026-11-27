package defpackage;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: nx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lnx0;", "Lat0;", "Lus0;", "_databaseProvider", "Lgv0;", "_time", "LZs0;", "_prefs", "<init>", "(Lus0;Lgv0;LZs0;)V", "LQw0;", "inAppMessage", "", "saveInAppMessage", "(LQw0;LJM;)Ljava/lang/Object;", "", "listInAppMessages", "(LJM;)Ljava/lang/Object;", "cleanCachedInAppMessages", "Lus0;", "Lgv0;", "LZs0;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C5619nx0 implements InterfaceC2828at0 {
    public static final long IAM_CACHE_DATA_LIFETIME = 15552000;

    @NotNull
    private final InterfaceC7073us0 _databaseProvider;

    @NotNull
    private final InterfaceC2601Zs0 _prefs;

    @NotNull
    private final InterfaceC4092gv0 _time;

    /* JADX INFO: renamed from: nx0$b */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository$cleanCachedInAppMessages$2", f = "InAppRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: nx0$b$a */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lns0;", "it", "", "invoke", "(Lns0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class a extends ML0 implements Function1<InterfaceC5604ns0, Unit> {
            final /* synthetic */ Set<String> $oldClickedClickIds;
            final /* synthetic */ Set<String> $oldMessageIds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Set<String> set, Set<String> set2) {
                super(1);
                this.$oldMessageIds = set;
                this.$oldClickedClickIds = set2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5604ns0 interfaceC5604ns0) {
                invoke2(interfaceC5604ns0);
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5604ns0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getCount() == 0) {
                    NS0.debug$default("Attempted to clean 6 month old IAM data, but none exists!", null, 2, null);
                    return;
                }
                if (it.moveToFirst()) {
                    do {
                        String string = it.getString("message_id");
                        String string2 = it.getString("click_ids");
                        this.$oldMessageIds.add(string);
                        this.$oldClickedClickIds.addAll(KD0.INSTANCE.newStringSetFromJSONArray(new JSONArray(string2)));
                    } while (it.moveToNext());
                }
            }
        }

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C5619nx0.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            String[] strArr = {"message_id", "click_ids"};
            String[] strArr2 = {String.valueOf((System.currentTimeMillis() / 1000) - C5619nx0.IAM_CACHE_DATA_LIFETIME)};
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            try {
                InterfaceC6863ts0.a.query$default(C5619nx0.this._databaseProvider.getOs(), "in_app_message", strArr, "last_display < ?", strArr2, null, null, null, null, new a(linkedHashSet, linkedHashSet2), 240, null);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C5619nx0.this._databaseProvider.getOs().delete("in_app_message", "last_display < ?", strArr2);
            C5619nx0.this._prefs.cleanInAppMessageIds(linkedHashSet);
            C5619nx0.this._prefs.cleanInAppMessageClickedClickIds(linkedHashSet2);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: nx0$c */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository", f = "InAppRepository.kt", l = {68}, m = "listInAppMessages")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(JM<? super c> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C5619nx0.this.listInAppMessages(this);
        }
    }

    /* JADX INFO: renamed from: nx0$d */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository$listInAppMessages$2", f = "InAppRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class d extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ List<C1881Qw0> $inAppMessages;
        int label;

        /* JADX INFO: renamed from: nx0$d$a */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lns0;", "it", "", "invoke", "(Lns0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class a extends ML0 implements Function1<InterfaceC5604ns0, Unit> {
            final /* synthetic */ List<C1881Qw0> $inAppMessages;
            final /* synthetic */ C5619nx0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C5619nx0 c5619nx0, List<C1881Qw0> list) {
                super(1);
                this.this$0 = c5619nx0;
                this.$inAppMessages = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5604ns0 interfaceC5604ns0) {
                invoke2(interfaceC5604ns0);
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5604ns0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.moveToFirst()) {
                    do {
                        this.$inAppMessages.add(new C1881Qw0(it.getString("message_id"), KD0.INSTANCE.newStringSetFromJSONArray(new JSONArray(it.getString("click_ids"))), it.getInt("displayed_in_session") == 1, new C3888fx0(it.getInt("display_quantity"), it.getLong("last_display"), this.this$0._time), this.this$0._time));
                    } while (it.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<C1881Qw0> list, JM<? super d> jm) {
            super(2, jm);
            this.$inAppMessages = list;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C5619nx0.this.new d(this.$inAppMessages, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((d) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            try {
                InterfaceC6863ts0.a.query$default(C5619nx0.this._databaseProvider.getOs(), "in_app_message", null, null, null, null, null, null, null, new a(C5619nx0.this, this.$inAppMessages), 254, null);
            } catch (JSONException e) {
                NS0.error("Generating JSONArray from iam click ids:JSON Failed.", e);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: nx0$e */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository$saveInAppMessage$2", f = "InAppRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class e extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ C1881Qw0 $inAppMessage;
        final /* synthetic */ ContentValues $values;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ContentValues contentValues, C1881Qw0 c1881Qw0, JM<? super e> jm) {
            super(2, jm);
            this.$values = contentValues;
            this.$inAppMessage = c1881Qw0;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C5619nx0.this.new e(this.$values, this.$inAppMessage, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((e) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            if (C5619nx0.this._databaseProvider.getOs().update("in_app_message", this.$values, "message_id = ?", new String[]{this.$inAppMessage.getMessageId()}) == 0) {
                C5619nx0.this._databaseProvider.getOs().insert("in_app_message", null, this.$values);
            }
            return Unit.a;
        }
    }

    public C5619nx0(@NotNull InterfaceC7073us0 _databaseProvider, @NotNull InterfaceC4092gv0 _time, @NotNull InterfaceC2601Zs0 _prefs) {
        Intrinsics.checkNotNullParameter(_databaseProvider, "_databaseProvider");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        this._databaseProvider = _databaseProvider;
        this._time = _time;
        this._prefs = _prefs;
    }

    @Override // defpackage.InterfaceC2828at0
    @Nullable
    public Object cleanCachedInAppMessages(@NotNull JM<? super Unit> jm) throws Throwable {
        Object objP = C5189lv.p(C6266r20.c, new b(null), jm);
        return objP == MN.d ? objP : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC2828at0
    @Nullable
    public Object listInAppMessages(@NotNull JM<? super List<C1881Qw0>> jm) {
        c cVar;
        if (jm instanceof c) {
            cVar = (c) jm;
            int i = cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.label = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(jm);
            }
        } else {
            cVar = new c(jm);
        }
        Object obj = cVar.result;
        MN mn = MN.d;
        int i2 = cVar.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) cVar.L$0;
            C1795Pt1.b(obj);
            return list;
        }
        C1795Pt1.b(obj);
        ArrayList arrayList = new ArrayList();
        ExecutorC7200vV executorC7200vV = C6266r20.c;
        d dVar = new d(arrayList, null);
        cVar.L$0 = arrayList;
        cVar.label = 1;
        return C5189lv.p(executorC7200vV, dVar, cVar) == mn ? mn : arrayList;
    }

    @Override // defpackage.InterfaceC2828at0
    @Nullable
    public Object saveInAppMessage(@NotNull C1881Qw0 c1881Qw0, @NotNull JM<? super Unit> jm) throws Throwable {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", c1881Qw0.getMessageId());
        contentValues.put("display_quantity", new Integer(c1881Qw0.getRedisplayStats().getDisplayQuantity()));
        contentValues.put("last_display", new Long(c1881Qw0.getRedisplayStats().getLastDisplayTime()));
        contentValues.put("click_ids", c1881Qw0.getClickedClickIds().toString());
        contentValues.put("displayed_in_session", Boolean.valueOf(c1881Qw0.getIsDisplayedInSession()));
        Object objP = C5189lv.p(C6266r20.c, new e(contentValues, c1881Qw0, null), jm);
        return objP == MN.d ? objP : Unit.a;
    }
}
