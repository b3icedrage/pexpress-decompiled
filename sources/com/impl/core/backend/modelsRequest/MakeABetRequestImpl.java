package com.impl.core.backend.modelsRequest;

import com.api.core.backend.domain.models.requestModels.MakeABetRequestApi;
import com.api.core.backend.domain.models.responseModels.AccountType;
import com.impl.core.backend.abstractModels.WebSocketRequestImpl;
import defpackage.AbstractC4743jm1;
import defpackage.C1575Mz0;
import defpackage.C1952Ru;
import defpackage.C5491nL;
import defpackage.EF0;
import defpackage.InterfaceC2691aI1;
import defpackage.InterfaceC4346i70;
import defpackage.R51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%&'(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl;", "Lcom/impl/core/backend/abstractModels/WebSocketRequestImpl;", "Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$Payload;", "Lcom/api/core/backend/domain/models/requestModels/MakeABetRequestApi;", "", "asset", "Ljava/lang/String;", "getAsset", "()Ljava/lang/String;", "", "amount", "J", "getAmount", "()J", "Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$BetDirectionImpl;", "betDirection", "Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$BetDirectionImpl;", "getBetDirection", "()Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$BetDirectionImpl;", "Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$AccountTypeImpl;", "accountType", "Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$AccountTypeImpl;", "f", "()Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$AccountTypeImpl;", "requestId", "h", "setRequestId", "(Ljava/lang/String;)V", "", "betDurationSeconds", "I", "getBetDurationSeconds", "()I", "payload", "Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$Payload;", "g", "()Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$Payload;", "Payload", "BetDirectionImpl", "AccountTypeImpl", "OptionTypeImpl", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MakeABetRequestImpl extends WebSocketRequestImpl<Payload> implements MakeABetRequestApi {

    @InterfaceC2691aI1("isDemo")
    @NotNull
    private final AccountTypeImpl accountType;
    private final long amount;

    @NotNull
    private final String asset;

    @InterfaceC2691aI1("action")
    @NotNull
    private final BetDirectionImpl betDirection;

    @InterfaceC2691aI1(C1575Mz0.TIME)
    private final int betDurationSeconds;

    @NotNull
    private final Payload payload;

    @Nullable
    private String requestId;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.impl.core.backend.modelsRequest.MakeABetRequestImpl$AccountTypeImpl[], still in use, count: 1, list:
      (r0v1 com.impl.core.backend.modelsRequest.MakeABetRequestImpl$AccountTypeImpl[]) from 0x001a: INVOKE (r0v1 com.impl.core.backend.modelsRequest.MakeABetRequestImpl$AccountTypeImpl[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m), WRAPPED] (LINE:27)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$AccountTypeImpl;", "", "", "intValue", "I", "getIntValue", "()I", "Companion", "DEMO", "REAL", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AccountTypeImpl {
        DEMO(1),
        REAL(0);

        private static final /* synthetic */ InterfaceC4346i70 $ENTRIES;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        private final int intValue;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$AccountTypeImpl$Companion;", "", "<init>", "()V", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            $ENTRIES = C1952Ru.i(new AccountTypeImpl[]{r0, r1});
        }

        public AccountTypeImpl(int i) {
            super(str, i);
            this.intValue = i;
        }

        public static AccountTypeImpl valueOf(String str) {
            return (AccountTypeImpl) Enum.valueOf(AccountTypeImpl.class, str);
        }

        public static AccountTypeImpl[] values() {
            return (AccountTypeImpl[]) $VALUES.clone();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIntValue() {
            return this.intValue;
        }

        @NotNull
        public final AccountType e() {
            return this.intValue == 1 ? AccountType.DEMO : AccountType.REAL;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$BetDirectionImpl;", "", "Companion", "CALL_UP", "PUT_DOWN", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BetDirectionImpl {
        private static final /* synthetic */ InterfaceC4346i70 $ENTRIES;
        private static final /* synthetic */ BetDirectionImpl[] $VALUES;

        @InterfaceC2691aI1("call")
        public static final BetDirectionImpl CALL_UP;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @InterfaceC2691aI1("put")
        public static final BetDirectionImpl PUT_DOWN;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$BetDirectionImpl$Companion;", "", "<init>", "()V", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            BetDirectionImpl betDirectionImpl = new BetDirectionImpl("CALL_UP", 0);
            CALL_UP = betDirectionImpl;
            BetDirectionImpl betDirectionImpl2 = new BetDirectionImpl("PUT_DOWN", 1);
            PUT_DOWN = betDirectionImpl2;
            BetDirectionImpl[] betDirectionImplArr = {betDirectionImpl, betDirectionImpl2};
            $VALUES = betDirectionImplArr;
            $ENTRIES = C1952Ru.i(betDirectionImplArr);
            INSTANCE = new Companion();
        }

        public BetDirectionImpl() {
            throw null;
        }

        public static BetDirectionImpl valueOf(String str) {
            return (BetDirectionImpl) Enum.valueOf(BetDirectionImpl.class, str);
        }

        public static BetDirectionImpl[] values() {
            return (BetDirectionImpl[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.impl.core.backend.modelsRequest.MakeABetRequestImpl$OptionTypeImpl[], still in use, count: 1, list:
      (r0v1 com.impl.core.backend.modelsRequest.MakeABetRequestImpl$OptionTypeImpl[]) from 0x000d: INVOKE (r0v1 com.impl.core.backend.modelsRequest.MakeABetRequestImpl$OptionTypeImpl[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m), WRAPPED] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$OptionTypeImpl;", "", "", "intValue", "I", "getIntValue", "()I", "DEFAULT", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OptionTypeImpl {
        DEFAULT;

        private static final /* synthetic */ InterfaceC4346i70 $ENTRIES;
        private final int intValue;

        static {
            $ENTRIES = C1952Ru.i(optionTypeImplArr);
        }

        public OptionTypeImpl() {
            super("DEFAULT", 0);
            this.intValue = 100;
        }

        public static OptionTypeImpl valueOf(String str) {
            return (OptionTypeImpl) Enum.valueOf(OptionTypeImpl.class, str);
        }

        public static OptionTypeImpl[] values() {
            return (OptionTypeImpl[]) $VALUES.clone();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIntValue() {
            return this.intValue;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$Payload;", "", "", "asset", "Ljava/lang/String;", "getAsset", "()Ljava/lang/String;", "", "amount", "J", "getAmount", "()J", "Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$BetDirectionImpl;", "betDirection", "Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$BetDirectionImpl;", "getBetDirection", "()Lcom/impl/core/backend/modelsRequest/MakeABetRequestImpl$BetDirectionImpl;", "", "accountType", "I", "getAccountType", "()I", "requestId", R51.PUSH_ADDITIONAL_DATA_KEY, "betDurationSeconds", "getBetDurationSeconds", "optionType", "getOptionType", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Payload {

        @InterfaceC2691aI1("isDemo")
        private final int accountType;
        private final long amount;

        @NotNull
        private final String asset;

        @InterfaceC2691aI1("action")
        @NotNull
        private final BetDirectionImpl betDirection;

        @InterfaceC2691aI1(C1575Mz0.TIME)
        private final int betDurationSeconds;
        private final int optionType;
        private final long requestId;

        public Payload(@NotNull String asset, long j, @NotNull BetDirectionImpl betDirection, int i, long j2, int i2, int i3) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(betDirection, "betDirection");
            this.asset = asset;
            this.amount = j;
            this.betDirection = betDirection;
            this.accountType = i;
            this.requestId = j2;
            this.betDurationSeconds = i2;
            this.optionType = i3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getRequestId() {
            return this.requestId;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return Intrinsics.a(this.asset, payload.asset) && this.amount == payload.amount && this.betDirection == payload.betDirection && this.accountType == payload.accountType && this.requestId == payload.requestId && this.betDurationSeconds == payload.betDurationSeconds && this.optionType == payload.optionType;
        }

        public final int hashCode() {
            return Integer.hashCode(this.optionType) + EF0.a(this.betDurationSeconds, C5491nL.a(EF0.a(this.accountType, (this.betDirection.hashCode() + C5491nL.a(this.asset.hashCode() * 31, 31, this.amount)) * 31, 31), 31, this.requestId), 31);
        }

        @NotNull
        public final String toString() {
            return "Payload(asset=" + this.asset + ", amount=" + this.amount + ", betDirection=" + this.betDirection + ", accountType=" + this.accountType + ", requestId=" + this.requestId + ", betDurationSeconds=" + this.betDurationSeconds + ", optionType=" + this.optionType + ")";
        }
    }

    public MakeABetRequestImpl(String asset, long j, BetDirectionImpl betDirection, AccountTypeImpl accountType, String str, int i) {
        long jNextLong;
        OptionTypeImpl optionType = OptionTypeImpl.DEFAULT;
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(betDirection, "betDirection");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        this.asset = asset;
        this.amount = j;
        this.betDirection = betDirection;
        this.accountType = accountType;
        this.requestId = str;
        this.betDurationSeconds = i;
        int intValue = accountType.getIntValue();
        String str2 = this.requestId;
        if (str2 != null) {
            jNextLong = Long.parseLong(str2);
        } else {
            AbstractC4743jm1.INSTANCE.getClass();
            jNextLong = AbstractC4743jm1.e.c().nextLong();
        }
        this.payload = new Payload(asset, j, betDirection, intValue, jNextLong, i, optionType.getIntValue());
    }

    @Override // com.impl.core.backend.abstractModels.WebSocketRequestImpl
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Payload getPayload() {
        return this.payload;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final AccountTypeImpl getAccountType() {
        return this.accountType;
    }

    @NotNull
    public final Payload g() {
        return this.payload;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }
}
