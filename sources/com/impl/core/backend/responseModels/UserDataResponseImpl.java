package com.impl.core.backend.responseModels;

import com.google.android.gms.common.Scopes;
import defpackage.C1039Gc0;
import defpackage.C1526Mj;
import defpackage.C5491nL;
import defpackage.C5896pG;
import defpackage.C6945uG;
import defpackage.IS1;
import defpackage.InterfaceC1247It1;
import defpackage.InterfaceC2691aI1;
import defpackage.R51;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/impl/core/backend/responseModels/UserDataResponseImpl;", "LIt1;", "LuG;", "Lcom/impl/core/backend/responseModels/UserDataResponseImpl$Profile;", Scopes.PROFILE, "Lcom/impl/core/backend/responseModels/UserDataResponseImpl$Profile;", "getProfile", "()Lcom/impl/core/backend/responseModels/UserDataResponseImpl$Profile;", "", "profileStatus", "Ljava/lang/Integer;", "getProfileStatus", "()Ljava/lang/Integer;", "emailStatus", "getEmailStatus", "", "", "countryList", "Ljava/util/Map;", "getCountryList", "()Ljava/util/Map;", "Profile", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserDataResponseImpl implements InterfaceC1247It1<C6945uG> {

    @InterfaceC2691aI1("countryList")
    @Nullable
    private final Map<String, String> countryList;

    @InterfaceC2691aI1("emailStatusInt")
    @Nullable
    private final Integer emailStatus;

    @InterfaceC2691aI1("userProfile")
    @Nullable
    private final Profile profile;

    @InterfaceC2691aI1("profileStatusInt")
    @Nullable
    private final Integer profileStatus;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/impl/core/backend/responseModels/UserDataResponseImpl$Profile;", "", "", "uid", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "email", "d", "nickname", "g", "country", "c", "balance", "b", "avatarUrl", R51.PUSH_ADDITIONAL_DATA_KEY, "firstName", "e", "lastName", "f", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Profile {

        @InterfaceC2691aI1("avatar_user")
        @NotNull
        private final String avatarUrl;

        @InterfaceC2691aI1("balance")
        @Nullable
        private final String balance;

        @InterfaceC2691aI1("country")
        @Nullable
        private final String country;

        @InterfaceC2691aI1("email")
        @Nullable
        private final String email;

        @InterfaceC2691aI1("first_name")
        @NotNull
        private final String firstName;

        @InterfaceC2691aI1("last_name")
        @NotNull
        private final String lastName;

        @InterfaceC2691aI1("nickname")
        @Nullable
        private final String nickname;

        @InterfaceC2691aI1("uid")
        @Nullable
        private final String uid;

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBalance() {
            return this.balance;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Profile)) {
                return false;
            }
            Profile profile = (Profile) obj;
            return Intrinsics.a(this.uid, profile.uid) && Intrinsics.a(this.email, profile.email) && Intrinsics.a(this.nickname, profile.nickname) && Intrinsics.a(this.country, profile.country) && Intrinsics.a(this.balance, profile.balance) && Intrinsics.a(this.avatarUrl, profile.avatarUrl) && Intrinsics.a(this.firstName, profile.firstName) && Intrinsics.a(this.lastName, profile.lastName);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getNickname() {
            return this.nickname;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getUid() {
            return this.uid;
        }

        public final int hashCode() {
            String str = this.uid;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.email;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.nickname;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.country;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.balance;
            return this.lastName.hashCode() + C1039Gc0.b(C1039Gc0.b((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.avatarUrl), 31, this.firstName);
        }

        @NotNull
        public final String toString() {
            String str = this.uid;
            String str2 = this.email;
            String str3 = this.nickname;
            String str4 = this.country;
            String str5 = this.balance;
            String str6 = this.avatarUrl;
            String str7 = this.firstName;
            String str8 = this.lastName;
            StringBuilder sbA = C5896pG.a("Profile(uid=", str, ", email=", str2, ", nickname=");
            C5896pG.b(sbA, str3, ", country=", str4, ", balance=");
            C5896pG.b(sbA, str5, ", avatarUrl=", str6, ", firstName=");
            sbA.append(str7);
            sbA.append(", lastName=");
            sbA.append(str8);
            sbA.append(")");
            return sbA.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x009c A[PHI: r8
      0x009c: PHI (r8v25 java.lang.String) = (r8v10 java.lang.String), (r8v27 java.lang.String) binds: [B:62:0x00a8, B:55:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    @Override // defpackage.InterfaceC1247It1
    public final C6945uG a() {
        Profile profile;
        String country;
        String str;
        String balance;
        Double d;
        String uid;
        Long lC0;
        Profile profile2 = this.profile;
        long jLongValue = (profile2 == null || (uid = profile2.getUid()) == null || (lC0 = StringsKt.c0(uid)) == null) ? 0L : lC0.longValue();
        Profile profile3 = this.profile;
        String email = profile3 != null ? profile3.getEmail() : null;
        if (email == null) {
            email = "";
        }
        Profile profile4 = this.profile;
        String firstName = profile4 != null ? profile4.getFirstName() : null;
        if (firstName == null || firstName.length() <= 0) {
            firstName = null;
        }
        Profile profile5 = this.profile;
        String lastName = profile5 != null ? profile5.getLastName() : null;
        if (lastName == null || lastName.length() <= 0) {
            lastName = null;
        }
        String[] elements = {firstName, lastName};
        Intrinsics.checkNotNullParameter(elements, "elements");
        String strJ = CollectionsKt.J(C1526Mj.o(elements), " ", null, null, null, 62);
        if (strJ.length() <= 0) {
            strJ = null;
        }
        if (strJ == null) {
            Profile profile6 = this.profile;
            strJ = profile6 != null ? profile6.getNickname() : null;
            if (strJ == null) {
                strJ = "";
            }
        }
        Map<String, String> map = this.countryList;
        if (map == null) {
            profile = this.profile;
            if (profile != null) {
                country = profile.getCountry();
            } else {
                country = null;
            }
            str = country != null ? country : "";
        } else {
            Profile profile7 = this.profile;
            String country2 = profile7 != null ? profile7.getCountry() : null;
            if (country2 == null) {
                country2 = "";
            }
            country = map.get(country2);
            if (country == null) {
                profile = this.profile;
                if (profile != null) {
                    country = profile.getCountry();
                } else {
                    country = null;
                }
                if (country != null) {
                }
            }
        }
        Profile profile8 = this.profile;
        double dDoubleValue = (profile8 == null || (balance = profile8.getBalance()) == null || (d = IS1.d(balance)) == null) ? 0.0d : d.doubleValue();
        Integer num = this.emailStatus;
        boolean z = num == null || num.intValue() != 0;
        Integer num2 = this.profileStatus;
        boolean z2 = num2 == null || num2.intValue() != 0;
        Profile profile9 = this.profile;
        return new C6945uG(jLongValue, email, strJ, str, null, null, dDoubleValue, 0.0d, z, z2, C5491nL.c("https://platform50.po2.capital", profile9 != null ? profile9.getAvatarUrl() : null), null, 131568);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserDataResponseImpl)) {
            return false;
        }
        UserDataResponseImpl userDataResponseImpl = (UserDataResponseImpl) obj;
        return Intrinsics.a(this.profile, userDataResponseImpl.profile) && Intrinsics.a(this.profileStatus, userDataResponseImpl.profileStatus) && Intrinsics.a(this.emailStatus, userDataResponseImpl.emailStatus) && Intrinsics.a(this.countryList, userDataResponseImpl.countryList);
    }

    public final int hashCode() {
        Profile profile = this.profile;
        int iHashCode = (profile == null ? 0 : profile.hashCode()) * 31;
        Integer num = this.profileStatus;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.emailStatus;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Map<String, String> map = this.countryList;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "UserDataResponseImpl(profile=" + this.profile + ", profileStatus=" + this.profileStatus + ", emailStatus=" + this.emailStatus + ", countryList=" + this.countryList + ")";
    }
}
